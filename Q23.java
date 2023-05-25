
public class Q23 {
    public static int longestSequence(int[] nums){
        if (nums.length == 0) {
            return 0;
          }
          boolean flag = false;
          int result = 0;
          int start = 0, end = 0;
          for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
              end = i;
            } else {
              start = i;
            }
            if (end - start > result) {
              flag = true;
              result = end - start;
            }
          }
          if (flag) 
          {
            return result + 1;
          } 
          else 
          {
            return result;
          }          
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,6,8,3,2,10};

        System.out.println(longestSequence(arr));
        
    }
    
}
