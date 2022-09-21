package src.oop.ls6Overriding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[] {new TeacherCreditManager(), new AgricultureCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager : baseCreditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }
}
