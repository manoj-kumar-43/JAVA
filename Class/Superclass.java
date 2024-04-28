class C {
    int x = 5;
}

class D extends C {
    int x = 20;

    void show() {
        System.out.println("value of derive class = " + x);
        System.out.println("value of base class = " + super.x);
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}