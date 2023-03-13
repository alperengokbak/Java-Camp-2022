package src.works;

public class work11Methods2 {
    public static void main(String[] args) {
        int sum = addition2(12, 13, 51, 66);
        addition(18, 25);
        System.out.println(sum);
    }
    
    public static int addition2(int... numbers){    // Çok önemli ve kullanılan bir yapıdır birden fazla (int veya string) değer kullanmak için kullanılır. Verdiğiniz değeri içerde array'e dönüştürüp, çoklu değer kullanma imkanı verir.
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static int addition(int x, int y){
        return x + y;
    }
}
