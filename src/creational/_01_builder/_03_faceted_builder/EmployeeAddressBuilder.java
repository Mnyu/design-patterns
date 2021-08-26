package creational._01_builder._03_faceted_builder;

public class EmployeeAddressBuilder extends EmployeeBuilder {

    public EmployeeAddressBuilder(Employee employee) {
        this.employee = employee;
    }

    public EmployeeAddressBuilder at(String street) {
        employee.setStreet(street);
        return this;
    }

    public EmployeeAddressBuilder withPostalCode(String postalCode) {
        employee.setPostCode(postalCode);
        return this;
    }

    public EmployeeAddressBuilder in(String city) {
        employee.setCity(city);
        return this;
    }
}
// Why sub-builders inherit from EmployeeBuilder?
// =================================================
// As soon as base builders inherit from EmployeeBuilder, they both expose the "works" and "lives" methods
// which means we can switch from 1 sub-builder to another sub-builder inside a single fluent api call. Check demo class.
