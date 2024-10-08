package htlgkr.friedlm.hue2.model;

import htlgkr.friedlm.hue2.interfaces.NumberTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {
        private NumberTest oddTester;
        private NumberTest primeTester;
        private NumberTest palindromeTester;

        public NumberTester(String fileName) {
        }

        public void setOddEvenTester(NumberTest oddTester) {
            this.oddTester = oddTester;
        }

        public void setPrimeTester(NumberTest primeTester) {
            this.primeTester = primeTester;
        }

        public void setPalindromeTester(NumberTest palindromeTester) {
            this.palindromeTester = palindromeTester;
        }

        public static void main(String[] args) {
            NumberTester tester = new NumberTester("numbers.txt");

            tester.setOddEvenTester(n -> n % 2 == 0);
            tester.setPrimeTester(n -> {
                if (n < 2) return false;
                for (int i = 2; i <= Math.sqrt(n); i++) {// sqrt = square root
                    if (n % i == 0) return false;
                }
                return true;
            });
            tester.setPalindromeTester(n -> {
                String s = Integer.toString(n);
                return s.equals(new StringBuilder(s).reverse().toString());
            });
        }

        public void testFile() throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            int n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++) {
                String[] parts = reader.readLine().split(" ");
                int testType = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);

                switch (testType) {
                    case 1:
                        if (oddTester.testNumber(number)) {
                            System.out.println("EVEN");
                        } else {
                            System.out.println("ODD");
                        }
                        break;
                    case 2:
                        if (primeTester.testNumber(number)) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        if (palindromeTester.testNumber(number)) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                }
            }
            reader.close();
        }
    }

