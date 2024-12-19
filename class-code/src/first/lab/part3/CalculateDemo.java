package first.lab.part3;

interface Calculator {
    int calculate(int a, int b);
}

public class CalculateDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("10 + 5 = " + add.calculate(10, 5));
        System.out.println("10 - 5 = " + subtract.calculate(10, 5));
        System.out.println("10 * 5 = " + multiplication.calculate(10, 5));
    }

}
