package creational._03_prototype._01_copy_constructor;

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Employee john = new Employee("John",
                new Address("123 Downing Street", "London", "UK"));

        Employee chris = new Employee(john);
        chris.setName("Chris");
        chris.getAddress().setStreetAddress("124 Downing Street");

        System.out.println(john);
        System.out.println(chris);
    }
}
// TAKEAWAY
// ==========================
// One of the good ways to explicitly specifying that an object is copyable is to provide a copy constructor.
// This is better than implementing Cloneable interface - Cloneable interface is never recommended.

