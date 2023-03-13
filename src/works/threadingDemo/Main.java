package src.works.threadingDemo;

public class Main {
    public static void main(String[] args) {
        stopwatchThread thread1 = new stopwatchThread("Thread1");
        stopwatchThread thread2 = new stopwatchThread("Thread2");
        stopwatchThread thread3 = new stopwatchThread("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
