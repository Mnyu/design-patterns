package _01_creational._01_builder._02_fluent_builders;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder withPosition(String position) {
        person.setPosition(position);
        return this;
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
