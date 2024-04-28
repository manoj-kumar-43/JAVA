class A {
    A() {
        System.out.println("This is Ashish");
    }

    A(int x) {
        this();
        System.out.println(x);
    }
}

class Demo {
    public static void main(String[] args) {
        A obj = new A(10);
    }
}