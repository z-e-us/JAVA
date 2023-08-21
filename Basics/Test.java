public class Test {
    public static void main(String[] args) {
        int rows = 8; // Number of rows in the pattern
        
        for (int i = 1; i <= rows; i++) {
            // Print '*' characters
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Print '_' characters
            for (int k = 1; k <= 2 * rows - 2 * i; k++) {
                System.out.print("_");
            }
            
            // Print '*' characters again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}