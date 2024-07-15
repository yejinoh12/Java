package thread;

public class ThreadSleepMain {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();

       try {
            Thread.sleep(2000);
       } catch(InterruptedException e) {}

        System.out.print("Main thread exiting.");
    }
}

class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("Thread1 종료");
    }
}

class Thread2 extends Thread {

    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("Thread2 종료");
    }


}
