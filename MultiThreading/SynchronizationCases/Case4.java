class Task {
   synchronized public void m1() {
        try {
            System.out.println(Thread.currentThread().getName() + " Executing m1()");
            Thread.sleep(1200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class First extends Thread {
    private Task x, y;

    public First(Task x, Task y) {
        this.x = x;
    }
}

public class Case4 {

}
