import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> list=new ArrayList<Integer>();
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        list.add(sum);
    }
       
        Object[] array = list.toArray();
         int[] intArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            intArray[i]=(int)array[i];
        }
    return intArray;
        }
    }
​
