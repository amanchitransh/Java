class numPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int div =1;

        while(x>=10 * div){
            div = div *10;
        }
        while(x!=0){
            int right = x% 10;
            int left = x / div;
            if(left != right){
                return false;
            }
            x = (x%div)/10;
            div = div /100;
        }
        return true;
    }

    public static void main(String[] args) {
        numPalindrome obj = new numPalindrome();
        int[] tests = {
                1410110141

        };

        for (int test : tests) {
            System.out.println("Input: \"" + test + "\" -> Output: " + obj.isPalindrome(test));
        }
    }
}