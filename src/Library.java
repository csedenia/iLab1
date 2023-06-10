public class Library {
    public class eMath {
        static int Power(int Base, int Exponent) {
            if (Exponent == 1)
                return Base * Exponent;
            else
                return Base * Power(Base, Exponent-1);
        }
        static int factorial(int n) {
            if (n == 1)
                return 1;
            else
                return (n * factorial(n - 1));
        }
        static void ckDigit(String iStr) {
            String str = iStr;
            StringBuilder myNumbers = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    myNumbers.append(str.charAt(i));
                    System.out.println(str.charAt(i) + " is a haha digit.");
                } else {
                    System.out.println(str.charAt(i) + " is not a haha digit");
                }
            }
        }
    }
}