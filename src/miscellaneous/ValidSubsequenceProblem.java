package miscellaneous;

public class ValidSubsequenceProblem {

    public static boolean isValidSub(String str, String sub){
        if (str==null || sub==null){

           throw new IllegalArgumentException("Invalid input: str and sub cannot be null");
        }

        if((sub.length()>str.length())){
            return false;
        }
        str = str.toLowerCase();
        sub= sub.toLowerCase();
        int i =0;
        int j=0;
        while(i<str.length() && j< sub.length()){
            if(str.charAt(i)==sub.charAt(j)){
                j++;
            }

            i++;
        }

        return j==sub.length();
    }

    public static void main(String[] args){

        System.out.println(isValidSub("abcde","ace"));
        System.out.println(isValidSub("abcde","aec"));
    }
}
