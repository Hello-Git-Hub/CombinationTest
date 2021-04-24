package com.company;
import java.util.*;

public class Main {

    // generate char combination from string list
    static void generateCombinations(String[] lists, List<String> result, int depth, String current) {
        if (depth == lists.length) {
            result.add(current);
            return;
        }
        for (int i = 0; i < lists[depth].length(); i++) {
            generateCombinations(lists, result, depth + 1, current + lists[depth].charAt(i));
        }
    }

    // map input nums into string list
    static List<String> mapNumsToStringList(int[] nums){
        String[] dic = { "",   "",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };

        List<String> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(dic[nums[i]].length()>0){
                result.add(dic[nums[i]]);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // inputs nums
        int[] input = new int[]{2,3};

        String[] srcList = mapNumsToStringList(input).toArray(new String[0]);
        List<String> result = new ArrayList<>();
        generateCombinations(srcList, result, 0, "");

        System.out.println((result));

    }
}
