package com.gomesvh.mod40.service.Impl;

import com.gomesvh.mod40.model.User;
import com.gomesvh.mod40.repository.IUserRepository;
import com.gomesvh.mod40.service.IUserService;
import com.gomesvh.mod40.service.exceptions.BusinessException;
import com.gomesvh.mod40.service.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record UserServiceIMPL(IUserRepository repository) implements IUserService {
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(String email) {
        return repository.findById(email)
                .orElseThrow(() -> new NotFoundException("User not found."));
    }

    @Override
    public User create(User user) {
        if (user.getEmail().isBlank() || user.getFirstName().isBlank() || user.getLastName().isBlank()) {
            throw new BusinessException("Empty fields, please fill in all the data.");
        }
        if (repository.existsById(user.getEmail())) {
            throw new BusinessException("User already registered.");
        }
        try {
            return repository.save(user);
        } catch (BusinessException e) {
            throw new BusinessException("User creation process failed");
        }
    }

    @Override
    public boolean delete(String email) {
        try {
            var user = this.findById(email);
            repository.delete(user);
            return true;
        } catch (BusinessException e) {
            throw new BusinessException("User removal process failed.");
        }
    }
}