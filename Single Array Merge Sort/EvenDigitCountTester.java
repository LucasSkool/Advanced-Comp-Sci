public class EvenDigitCountTester {
    public static void main(String[] args) {
        System.out.println(countEvenDigits(13579));
        System.out.println(countEvenDigits(1325798));
        System.out.println(countEvenDigits(24680));
        System.out.println(countEvenDigits(0));
        System.out.println(countEvenDigits(-1234567890));
    }

    public static int countEvenDigits(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number % 2 == 0) {
            return 1 + countEvenDigits(number / 10);
        }
        return countEvenDigits(number / 10);
    }
}
