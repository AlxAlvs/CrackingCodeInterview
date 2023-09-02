package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[ ] args) {
        int[] arr1 = {1,2,3,1};
        System.out.println(containsDuplicate(arr1));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer found = numbers.getOrDefault(nums[i], 0);
            if(found > 0) {
                return true;
            }
            numbers.put(nums[i], found + 1 );
        }

        return false;
    }

}
