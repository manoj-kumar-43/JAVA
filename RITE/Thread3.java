class demo1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("task1..." + this.getName() + "  " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class demo2 extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                System.out.println("task2.." + this.getName() + "  " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class demo3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("task3.." + this.getName() + "  " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class test {
    public static void main(String[] args) throws InterruptedException {
        demo1 obj1 = new demo1();
        demo2 obj2 = new demo2();
        demo3 obj3 = new demo3();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}