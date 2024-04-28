class demo implements Runnable {
    public void run() {
        System.out.println("hello thread using runable");
    }

    public static void main(String[] args) {
        demo obj = new demo();
        Thread t = new Thread(obj);
        t.start();
    }
}