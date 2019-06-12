public class ReverseNumber {
    public static void main(String[] args) {
        revertNumber(12345);
        revertNumber(101010);
        revertNumber(987654321);
        revertNumber(0);
        revertNumber(1);
    }

    private static void revertNumber(int numberToRevert) {
        int createdNumber;
        do {
            createdNumber = numberToRevert % 10;
            numberToRevert = numberToRevert / 10;
            System.out.print(createdNumber);
        } while (numberToRevert > 0);
        System.out.println();
    }
}