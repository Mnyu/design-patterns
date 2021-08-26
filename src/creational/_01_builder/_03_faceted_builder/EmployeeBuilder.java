package creational._01_builder._03_faceted_builder;

// Builder FACADE Design
public class EmployeeBuilder {

    protected Employee employee = new Employee();

    public EmployeeAddressBuilder lives() {
        return new EmployeeAddressBuilder(employee);
    }

    public EmployeeJobBuilder works() {
        return new EmployeeJobBuilder(employee);
    }

    public Employee build() {
        return employee;
    }
}
