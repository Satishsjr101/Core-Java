class Task {
    synchronized public void m1() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Executing m1()");
                Thread.sleep(1200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void m2() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Executing m2()");
                Thread.sleep(1500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class First extends Thread {
    private Task x;

    public First(Task x) {
        this.x = x;
    }

    public void run() {
        x.m1();
        x.m2();
    }

}

class Case2 {
    public static void main(String[] args) {
        Task task = new Task();
        First t1 = new First(task);
        First t2 = new First(task);

        t1.setName("T1-Thread");
        t2.setName("T2-Thread");

        t1.start();
        t2.start();
    }
}
