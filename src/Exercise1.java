public class Exercise1 {
    static double Multiply3(double first, double second, double third) {
        return first * second * third;
    }

    static void divide(int a, int b) {
        System.out.println("Целое = " + a / b + "Остаток = " + a % b);
    }

    class Exercise1Test {
        public static void main(String[] args) {
            System.out.println(Exercise1.Multiply3(3, 4, 5));
            System.out.println(Exercise1.Multiply3(3, 4, 5));
            Exercise1.divide(12, 32);
            Exercise1.divide(85, 12);
        }
    }
}
