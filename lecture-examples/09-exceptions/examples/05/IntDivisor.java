import java.util.Scanner;

public class IntDivisor {

    public static int quotient(int numerator, int denominator ) throws ArithmeticException
    {
        if (  denominator == 0 )
            throw new ArithmeticException("Ο διαιρέτης δεν μπορεί να είναι μηδέν (/0)!");
        // διαιρετέος, διαιρέτης
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exceptionFlag = true; // συνέβη σφάλμα;
        do {
            try {
                System.out.print("Δώσε διαιρετεό: ");
                int n = sc.nextInt();

                System.out.print("Δώσε διαιρέτη: ");
                int d = sc.nextInt();

                System.out.println("Πηλίκο: "+ quotient(n, d));
                exceptionFlag = false;
            }
            catch (ArithmeticException aex) {
                System.out.println("\nΣυνέβη ένα ArithmeticException: "+ aex);
                System.out.println("Δοκιμάστε πάλι. Θυμηθείτε! Δεν διαιρούμε με το μηδέν.\n");
                System.exit(-1); // Is finally block executed - Does do..while iteration continue?
                return; // Is finally block executed - Does do..while iteration continue?
            }
            /* Not catching InputMismatchExceptions; try a floating point input - is finally block executed?
            catch (java.util.InputMismatchException imex) {
                System.out.println("\nΣυνέβη ένα InputMismatchException: "+ imex);
                System.out.println("Δοκιμάστε πάλι... και αυτή τη φορά δώστε δύο ΑΚΕΡΑΙΟΥΣ!\n");
                sc.nextLine(); // Παραβλέπουμε τη λάθος είσοδο.
            }*/
            finally {
                System.out.println("Μη ξεχνάτε ότι το σύνολο των ακεραίων δεν είναι κλειστό ως προς τη διαίρεση, μπορεί να υπάρχει και υπόλοιπο!");
            }

        } while (exceptionFlag);


    }
}
