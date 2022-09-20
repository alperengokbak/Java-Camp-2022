package src.opp.ls2RecapDemoClasses;

public class MainClass {
    public static void main(String[] args) {
        fourProcessors proc = new fourProcessors();
        int sum = proc.Addition(18, 25);
        System.out.println(sum);
    }
}
