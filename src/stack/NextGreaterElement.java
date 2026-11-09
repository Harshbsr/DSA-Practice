package stack;

import java.util.Stack;

public class NextGreaterElement {
    //arr=[3,4,7,5,8,1]
    //result=[4,7,8,8,-1,-1]


    public static int[] nextGrElm(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 7, 5, 8, 1};

        int result[] = nextGrElm(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
