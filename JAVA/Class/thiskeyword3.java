class S {
    void m(S obj) {
        System.out.println("Method executed");
    }

    void n() {
        m(this);
    }

    public static void main(String[] args) {
        S obj = new S();
        obj.n();
    }
}