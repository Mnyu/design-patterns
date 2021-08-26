package creational._03_prototype._02_copy_through_serialization;

import org.apache.commons.lang3.SerializationUtils;

public class CopyThroughSerializationDemo {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");
        Foo foo2 = SerializationUtils.roundtrip(foo);  // IMPORTANT
        foo2.setWhatever("XYZ");
        System.out.println(foo);
        System.out.println(foo2);
    }
}
// 1 problem with Copy Constructor : We have to build a copy constructor for every single type.
// Imagine having a hierarchy of 10-20 different types => 10-20 different copy constructors else one of those objects
// won't be copied correctly. It will not be a DEEP COPY, rather a SHALLOW COPY.

// So, now the problem is : Given a complicated hierarchy of types, how can we actually copy the objects?
// 1 Solution : Use SERIALIZATION
// Above uses Serialization and De-serialization Apache Commons library - SerializationUtils.roundtrip(foo)
// There are other libraries as well that do this, some of them don't even need the object to implement
// Serializable interface. Find the appropriate one.
