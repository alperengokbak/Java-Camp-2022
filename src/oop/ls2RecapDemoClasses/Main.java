package src.oop.ls2RecapDemoClasses;

public class Main {
    public static void main(String[] args) {
        fourProcessors proc = new fourProcessors();

        int sum = proc.Addition(18, 25);
        System.out.println(proc.Addition(18, 25, 30, 50));
        System.out.println(sum);
    }
}
