package creational._01_builder._03_faceted_builder;

public class EmployeeJobBuilder extends EmployeeBuilder {

    public EmployeeJobBuilder(Employee employee) {
        this.employee = employee;
    }

    public EmployeeJobBuilder at(String company){
        employee.setCompany(company);
        return this;
    }

    public EmployeeJobBuilder as(String position){
        employee.setPosition(position);
        return this;
    }

    public EmployeeJobBuilder withIncome(int income){
        employee.setAnnualIncome(income);
        return this;
    }
}
// Why sub-builders inherit from EmployeeBuilder?
// =================================================
// As soon as base builders inherit from EmployeeBuilder, they both expose the "works" and "lives" methods
// which means we can switch from 1 sub-builder to another sub-builder inside a single fluent api call. Check demo class.
