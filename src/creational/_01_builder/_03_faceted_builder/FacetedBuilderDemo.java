package creational._01_builder._03_faceted_builder;

public class FacetedBuilderDemo {
    public static void main(String[] args) {
        Employee rahul = new EmployeeBuilder()
                .lives()
                    .at("123 Downing Street")
                    .in("London")
                    .withPostalCode("945681")
                .works()
                    .at("Facebook")
                    .as("SDE")
                    .withIncome(123000)
                .build();
        System.out.println(rahul);
    }
}
// Until now, single builder for building a particular object, but it's not always the case.
// Sometimes the object we are building is so complicated that single builder is not sufficient.
// => More than 1 builder.

// TAKEAWAY :
// ==================
// If an object is complicated and several builders are required, we can give them(several builds) a common interface
// or a common class(in this case EmployeeBuilder) and this class/interface can expose the sub-builders through its methods.
// And certainly the fact that it is a fluent interface allows us to jump from 1 sub-builder to another with ease
// by calling the appropriate method of the common interface/class.
