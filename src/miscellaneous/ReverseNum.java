package miscellaneous;

/*
Text from the image:

Q. Given an Integer x. Return x with its digits reversed.

Example 1

Given an Integer - (1234).
Output -- (4321)

Example 2

Given an Integer - (-1234).
Output -- (-4321)

Example 3

Given an Integer - (2147483647).
Output -- (7463847412)
 */
public class ReverseNum {

    public static int reverse(int num){
        int x = Math.abs(num);
        int reverse=0;
        while(x>0){
            reverse= reverse * 10 +x%10;;
            x=x/10;
        }

        return  num <0? reverse * -1 : reverse;
    }


    public static int reverse2(int x) {// leetcode
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 ||rev < Integer.MIN_VALUE / 10 )
                return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }
    public static  void main(String[] args){
      int num = -1234;
      int num2 = 1234;
       System.out.println(reverse(num));
        System.out.println( reverse(num2));
    }
}
