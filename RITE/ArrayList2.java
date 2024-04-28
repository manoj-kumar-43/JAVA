import java.util.*;

class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;

    }
}

class test {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Manoj");
        Student s2 = new Student(11, "aja");
        ArrayList<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        Iterator i = li.iterator();
        while (i.hasNext()) {
            Student s = (Student) i.next();
            System.out.println("roll : " + s.roll + "name :" + s.name);
        }
    }
}