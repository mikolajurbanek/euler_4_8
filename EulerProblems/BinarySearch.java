
public class BinarySearch {

    protected boolean lookForNumber(int[] nums, int num){
        for(int number : nums){
            if(num==number){
                return true;
            }
        } return false;
    }
}
