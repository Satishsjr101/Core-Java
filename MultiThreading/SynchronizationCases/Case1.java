class Task {
    synchronized public void m1() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " executing m1()");
                Thread.sleep(1210);
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
    }
}

class Case1Main {
    public static void main(String[] args) {
        Task task = new Task();
        First t1 = new First(task);
        First t2 = new First(task);

        t1.setName("T1-thread ");
        t2.setName("T2-thread ");
        t1.start();
        t2.start();
    }
}