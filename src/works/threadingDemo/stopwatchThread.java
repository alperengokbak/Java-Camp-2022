package src.works.threadingDemo;

public class stopwatchThread implements Runnable{
    private Thread t;
    private String threadName;

    public stopwatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Being Created... " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running... " + threadName);

        try {
            for(int i = 1; i <= 10; i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread's process is done. " + threadName);
    }
    public void start(){
        System.out.println("Thread is being created.");
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
