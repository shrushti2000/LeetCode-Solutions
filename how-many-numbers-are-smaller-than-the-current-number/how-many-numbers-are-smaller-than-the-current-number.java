import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count=count+1;
                }
            }
            list.add(count);
        }
        Object[] objArray=list.toArray();
        int[] intArray=new int[objArray.length];
        for(int i=0;i<intArray.length;i++){
            intArray[i]=(int)objArray[i];
        }
        return intArray;
    }
}