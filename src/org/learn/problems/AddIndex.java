package org.learn.problems;

// Provided an array of integers and sum value.
// Objective is to find out whether the sum of int in array is equal to provided sum value..

import java.util.Set;
import java.util.TreeSet;

public class AddIndex {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4}; int sum=11;
  /*      System.out.println(hasPairWithSum(arr, sum));
        System.out.println(hasPairWithSumLinear(arr, sum));
        hasPairWithSumLinearUnsorted(10);*/
        System.out.println(hasPairWithSumLinearUnsorted(20));
    }

    // Complexity O(n^2)
    public static boolean hasPairWithSum(int arr[],int sum) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j] == sum)
                    return true;
            }
        }
        return false;
    }

    // Complexity O(n)
    public static boolean hasPairWithSumLinear(int arr[],int sum) {
        int low =0;
        int high = arr.length-1;

        while(low < high){
            if(arr[low]+arr[high] == sum) {
                return true;
            } else if(arr[low]+arr[high] < sum) {
                low++;
            } else {
                high--;
            }
        }
        return  false;
    }

    //Complexiy O(n) with unsorted array
    public static boolean hasPairWithSumLinearUnsorted(int sum) {
        int arr[] = {1,5,8,7,4};
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        for(int a: arr) {
            if(set.contains(a))
                return true;

            set.add(sum - a);
        }

        return false;
    }
}
