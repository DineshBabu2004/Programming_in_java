package Recursion;

import java.util.ArrayList;

public class SubSequences{
    static ArrayList<String> subsequences(String str){
            ArrayList<String> ans = new ArrayList<>();
            if(str.length()==0){
                ans.add("");
                return ans ;
            }
            char currChar = str.charAt(0);
            ArrayList<String> smallAns = subsequences(str.substring(1));
            for(String ss :smallAns){
                ans.add(ss);
                ans.add(ss+currChar);
            }
            return ans;

    }
    static void orderSubsequences(String s,String currans){
        if(s.length()==0){
            System.out.println(currans);
            return;
        }

        char curr = s.charAt(0);
        orderSubsequences(s.substring(1), currans+curr);
        orderSubsequences(s.substring(1), currans);
        

    }
    static void numSubSequence(int []num,int idx,int sum){
        if(num.length ==idx){
            System.out.println(sum);
            return;
        }
        int currSum = num[idx];
        numSubSequence(num, idx+1, currSum+sum);
        numSubSequence(num, idx+1, sum);
    }
    public static void main(String[] args) {
        // String ans = "abc";
        int []arr = {2,4,5};
        // System.out.println(subsequences(ans));
        // orderSubsequences(ans, "");
        numSubSequence(arr, 0, 0);
    }
}