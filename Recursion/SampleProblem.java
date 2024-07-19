package Recursion;

public class SampleProblem {
    public static void year(int n , String [] numbers){
        //You are given a number (eg - 2019), convert it into a String of english like
        // “two zero one nine”. Use a recursive function to solve this problem.
        // NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
        // can’t be 0.
        // Sample Input : 1947
        // Sample Output : “one nine four seven”
        if(n==0){
            return;
        }
        
        year(n/10, numbers);
        System.out.print(numbers[n%10]+" ");
    }


    public static void main(String[] args) {
        String [] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
       
        year(1947, numbers);
    }
    
}
