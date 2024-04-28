class A {
    void Run() {
        System.out.println("This is Ram");
    }
}

class B extends A {
    void Run() {
        System.out.println("This is Hari");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.Run();
    }
}
