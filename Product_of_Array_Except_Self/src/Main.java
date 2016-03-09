public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] res = productExceptSelf(new int[]{1, 2, 3, 4});
        for (int r : res) {
            System.out.println(r);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int right_accumlated = 1;

        // initialization
        res[0] = 1;

        // from left to right
        for (int i = 1; i < n; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        // from right to left
        for (int i = n-1; i >= 0; i--) {
            res[i] = res[i] * right_accumlated;
            right_accumlated = right_accumlated * nums[i];
        }

        return res;
    }
}
