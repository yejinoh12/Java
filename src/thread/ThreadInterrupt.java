package thread;

import javax.swing.*;
/**
 * interrupt : interrupted 상태를 바꿈
 * interrupted : interrupt가 호출되었는지를 알려줌 호출되지 않았다면 fasle, 호출 되었다면 true
 */

public class ThreadInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력");
        System.out.println("input: " + input);
        thread.interrupt(); //interrupted 상태가 true가 된다.
        System.out.println("isinterrupted: " + thread.isInterrupted());
    }
}

class MyThread extends Thread {
    public void run() {
        int i = 10;
        while (i != 0 && !isInterrupted()) { //interrupte가 호출 되지 않았을 경우(false) 반복
            System.out.println(i--);
            try{
                Thread.sleep(1000); //sleep에 의해 thread가 멈춰있을 때 interrupt를 하게 되면, InterruptedException 발생되고 interrupted 상태가 false로 초기화
            }catch (InterruptedException e){
                interrupt(); //interrupt 의 생태를 true 로 바꾸어 주어야함
            }
        }
        System.out.println("Thread interrupted");
    }
}