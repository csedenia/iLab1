public class Main1 {
    public static void main(String[] args) {
        System.out.println("===> Function 81 : Scan Numeric data in a string!");
        String str = "a9b2c3$5%0";
        Library.eMath.ckDigit(str);
        System.out.println("===> Function 82 : Compute b to power n!");
        int b = 2;
        int n = 10;
        System.out.println(b + " to power "+n+" = " + Library.eMath.Power(b,n));
        System.out.println("===> Function 83 : Compute n's factorial!");
        System.out.println(n + "'s factorial = " + Library.eMath.factorial(n));
    }
}
