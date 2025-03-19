package src.main.Domain.Jpa;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface Persistente {
    public Long getId();

    public void setId(Long id);
}