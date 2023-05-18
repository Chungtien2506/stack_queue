

import java.util.Scanner;
import java.util.Stack;

public class thapphansangnhiphan {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        System.out.print("Nhập số cần chuyển đổi: ");
        int number = new Scanner(System.in).nextInt();


        while (number > 0){
            int reNumber = number % 2;
            integerStack.push(reNumber);
            number = number / 2;
            System.out.println(integerStack);
        }

        String binary = "";
        while (!integerStack.isEmpty()) {
            int num = integerStack.pop();
            binary += num;
        }
        System.out.println(binary);

    }
}
