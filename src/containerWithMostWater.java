public class containerWithMostWater {
    public int maxArea(int[] height) {
//        int n = height.length;
        int maxArea = 0;
        //brute
        // for (int i=0; i<n; i++) {
        //     for (int j=i+1; j<n; j++) {
        //         int width = j-i;
        //         int minHeight = Math.min(height[i], height[j]);
        //         int area = width * minHeight;
        //         maxArea = Math.max(maxArea, area);
        //     }
        // }
        //pointer
        int l = 0;
        int r = (height.length - 1);

        while (l<r){
            int width = r-l;
            int minHeight = Math.min(height[l], height[r]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        containerWithMostWater obj = new containerWithMostWater();
        int[] tests = {
                8,1,7,5,1,7,8,9,4,5,9
        };

            System.out.println("Max Area " + obj.maxArea(tests));
    }
}
