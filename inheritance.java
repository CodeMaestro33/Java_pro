class Teacher {
    String designation = "Teacher";
    String collegeName = "polytechnic";

    void does() {
        System.out.println("Teaching");
    }
}

class ComputerTeacher extends Teacher{
    String mainSubject="Computer";
    public static void main(String args[]) {
        ComputerTeacher obj = new ComputerTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation); // corrected typo here
        System.out.println(obj.mainSubject);
        obj.does(); // corrected typo here
    }
}
