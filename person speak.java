class Person {
    public void speak() {
        System.out.println("Person speaks");
    }
}

class Teacher extends Person {
    @Override
    public void speak() {
        System.out.println("Teacher speaks");
    }
}

 class StaticBinding {
    public static void main(String[] args) {
        Person obj1 = new Person(); // Correct instantiation
        obj1.speak();

        Person obj2 = new Teacher(); // Correct instantiation, dynamic binding
        obj2.speak();
    }
}
