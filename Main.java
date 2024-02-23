class EncapTest {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Billy");
        encap.setAge(19);
        System.out.println("Name: " + encap.getName() + "\nAge: " + encap.getAge());
    }
}
