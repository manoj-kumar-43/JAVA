class Employee {
    int eid;
    String ename;

    Employee(int id, String name) {
        this.eid = id;
        this.ename = name;
    }
}

class Test9 {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Manoj");
        Employee e2 = new Employee(200, "Arjun");
        System.out.println(e2.ename);
    }
}