class A {
    void meth1() {
        System.out.println("This is the method 1 of A");
    }
}

class B extends A {
    void meth2() {
        System.out.println("This is the method 2 of B");
    }
}

class C extends B {
    void meth3() {
        System.out.println("This is the method 3 of C");
    }
}

class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth1();
        obj.meth2();

        C obj1 = new C();
        obj1.meth1();
        obj1.meth2();
        obj1.meth3();

        A obj2 = new A();
        obj2.meth1();
    }
}