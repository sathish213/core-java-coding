package ThreeSum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = threeSum(nums);
        Iterator itr = results.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    private static List<List<Integer>> threeSum(int [] nums){
        List<List<Integer>> l2= new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            for (int j=i+1; j<nums.length-1; j++) {
                    int sum = 0;
                    sum = nums[i] + nums[j] + nums[j+1];
                    if (sum == 0){
                        List<Integer> l1= new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[j+1]);
                        l2.add(l1);
                    }
            }

        }
        return l2;
    }
}
