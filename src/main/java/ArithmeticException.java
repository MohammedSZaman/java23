//ArithmeticException Division by 0
public class ArithmeticException {

    public static void main(String[] args) {
        int a = 50, b = 0;
        int c = divideAndSquare(a, b);
        System.out.println(c);
    }

   static int divideAndSquare(int x, int y) {
        int z = x / y;
        return z * z;
   }

}
