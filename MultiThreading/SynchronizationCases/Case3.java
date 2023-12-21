class Task {
    synchronized public void m1() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Executing m1()");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void m2() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Executing m2()");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void m3() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Executing m3()");
                Thread.sleep(1000);
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
        x.m3();
    }
}

public class Case3 {
    public static void main(String[] args) {
        Task x;
        First t1 = new First(x);
    }
}
