
    public class NumberTester {
        private NumberTest oddTester;
        private NumberTest primeTester;
        private NumberTest palindromeTester;

        public NumberTester(String fileName) {
            // TODO
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
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return false;
                }
                return true;
            });
            tester.setPalindromeTester(n -> {
                String s = Integer.toString(n);
                return s.equals(new StringBuilder(s).reverse().toString());
            });
        }

        public void testFile() {
            // TODO
        }
    }

