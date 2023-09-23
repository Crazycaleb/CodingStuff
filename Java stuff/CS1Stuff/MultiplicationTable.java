public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) 
            {
                int number = i * j;
                System.out.printf("%10d", number);
            }
            System.out.println();
        }
    }
}
