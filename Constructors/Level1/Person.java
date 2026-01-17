/* This class demonstrates a copy constructor */
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name; // copies name
        this.age = p.age; // copies age
    }
}
