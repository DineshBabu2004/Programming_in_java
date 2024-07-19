package Backtracking;
public class KeyPad{
    static void  keypadCombinations(String ques,String ans,String []keypad ){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        int position = ques.charAt(0)-'0';
        String currCombination = keypad[position];
        for (int i = 0; i < currCombination.length(); i++) {
            keypadCombinations(ques.substring(1), ans+currCombination.charAt(i), keypad);
        }
    }
    public static void main(String[]args){
        String []keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keypadCombinations("79", "", keypad);
    }
}