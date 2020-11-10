public class BinarySearch {

    protected boolean lookForNumber(int[] nums, int num) {
        for (int j = 0; j < nums.length; j++) {
            int oldNumber = nums[j];
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] < nums[j]) {
                    nums[j] = nums[i];
                    nums[i] = oldNumber;
                }
            }
        }
        int mid = nums.length / 2 ;
        int low = 0;
        int high = nums.length;
        while (!(num==nums[mid])){

            mid = (high + low)/2;

            if(low>high){
                return false;
            }

            if (num < nums[mid]) {
                high = mid -1;
            }

            if (num > nums[mid]) {
                low = mid +1;
            }


        }
        return true;
    }
}
