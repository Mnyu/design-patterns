package creational._01_builder._02_fluent_builders;

public class FluentInterfaceDemo {
    public static void main(String[] args) {
        Person rahul = new PersonBuilder<>()
                .withName("Rahul")
                // .withPosition("Developer") --- This method is not available here
                .build();
        System.out.println(rahul);

        Person adam = new EmployeeBuilder()
                .withName("Adam")
                .withPosition("Developer")
                .build();
        System.out.println(adam);
    }
}
// KEY TAKEAWAY :
// ==========================
// If we want a fluent interface to propagate across inheritance hierarchies,
// then we need to have RECURSIVE GENERIC DEFINITION.

// Instead of just having a PersonBuilder, we have a PersonBuilder which takes a type-argument SELF which extends PersonBuilder.
// And for every kind of inheritor, stick that inheritor as a type-argument of PersonBuilder,
// thereby propagating this idea of always returning a typed-reference to the most derived type that we are working with.
