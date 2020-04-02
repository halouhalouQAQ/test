package Demo01;

public class MyThread02 implements Runnable {

    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Thread(new MyThread02()).start();
    }
}
