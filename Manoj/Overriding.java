class A {
    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth2();
        obj.meth3();
    }
}
