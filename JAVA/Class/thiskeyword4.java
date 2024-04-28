class A {
    A getA() {
        return this;
    }

    void display() {
        System.out.println("Hello Manoj");
    }
}

class Demo12 {
    public static void main(String[] args) {
        A obj = new A();
        obj.getA();
        obj.display();
    }
}