package edu.java.abstract_factory;
public class Customer {
    private final String gradeRequest;
    private final boolean hasCompanyContract;
    public Customer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public boolean hasCompanyContract () {
        return hasCompanyContract;
    }
    public String getGradeRequest () {
        return gradeRequest;
    }
}