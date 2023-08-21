package Basic;
public class Test {
    public static void main(String[] args) {
        int size = 9; // Adjust the size of the pattern here

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2 - 1; col++) {
                if (col >= row && col < size * 2 - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
