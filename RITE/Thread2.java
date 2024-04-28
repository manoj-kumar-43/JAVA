class task1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("task1......" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class task2 implements Runnable {
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                System.out.println("task2......" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class test {
    public static void main(String[] args) throws InterruptedException {
        task1 obj1 = new task1();
        task2 obj2 = new task2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}