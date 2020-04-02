package Demo01;

public class MyThread extends Thread {

    public void run(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
