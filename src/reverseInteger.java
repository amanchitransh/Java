public class reverseInteger {
    // reverse 32 bit integer
        public int reverse(int x) {
            int min = -2147483648;
            int max = 2147483647;
            int res = 0;
            while (x != 0) {
                int lastDigit = x % 10;
                x = x / 10;
                if ((res > max / 10) || (res == max / 10 && lastDigit >= max % 10)) {
                    return 0;
                }
                if ((res < min / 10) || (res == min / 10 && lastDigit <= min % 10)) {
                    return 0;
                }
                res = (res * 10) + lastDigit;
            }
            return res;
        }
    public static void main(String[] args) {
            reverseInteger reverseInteger = new reverseInteger();
            System.out.println("7878898");
        System.out.println("Reverse of the above number is:");

        System.out.println(reverseInteger.reverse(7878898));

    }
}
