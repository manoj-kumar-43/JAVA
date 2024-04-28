class Student {
    int sid;
    String sname;

    Student(int id, String name) {
        this.sid = id;
        this.sname = name;
    }

}

class test {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Sunny");
        Student s2 = new Student(20, "Suraj");
        System.out.println(s1.sname);
        System.out.println(s2.sname);
    }
}