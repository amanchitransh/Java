public class strToInt {
    public int myAtoi(String s) {
        s = s.stripLeading();
        if (s.length() <= 0) return 0;
        int i = 0, n = s.length();
        int sign = 1;
        int parsed = 0;
        int min = -2147483648;
        int max = 2147483647;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            i++;
            sign = -1;
        }
        while (i < n) {
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            int digit = s.charAt(i) - '0';
            if (parsed > (max - digit) / 10) {
                return sign == 1 ? max : min;
            }
            parsed = parsed * 10 + digit;
            i++;
        }
        return parsed * sign;
    }
    public static void main(String[] args) {
        strToInt obj = new strToInt();
        String[] tests = {
                "42",
                "   -42",
                "4193 with words",
                "2147483648",
                "-2147483649",
                "+",
                ""
        };

        for (String test : tests) {
            System.out.println("Input: \"" + test + "\" -> Output: " + obj.myAtoi(test));
        }
    }
}
