class A {
    synchronized public void m1(B obj) {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " m1() executed...");
                Thread.sleep(1200);
            }
            obj.p2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void m2() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " m2() executed...");
                Thread.sleep(1200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B {
    synchronized public void p1(A obj) {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " p1() executed...");
                Thread.sleep(1800);
            }
            obj.m2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void p2() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " p2() executed...");
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class First extends Thread {
    private A a;
    private B b;

    public First(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        a.m1(b);
    }
}

class Second extends Thread {
    private A a;
    private B b;

    public Second(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        b.p1(a);
    }
}

public class DeadLockCondition {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        First t1 = new First(a, b);
        Second t2 = new Second(a, b);

        t1.setName("Thread - 1");
        t2.setName("Thread - 2");

        t1.start();
        t2.start();
    }
}
