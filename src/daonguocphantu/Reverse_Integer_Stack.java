package daonguocphantu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Reverse_Integer_Stack {
    public static void main(String[] args) {
        //khởi tạo mảng ban đầu
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));

        //Khởi tạo 1 mảng stack rỗng;
        Stack<Integer> integerStack = new Stack<>();

        //đưa từng phần tử của mảng vào stack
        for (int i : arr){
            integerStack.push(i);
        }

//        //đưa từng phần tử của mảng vào stack
//        for (int i = 0; i < arr.length; i++){
//            integerStack.push(arr[i]);
//        }
        System.out.println("Mảng stack được lưu " + integerStack);

        //lấy từng phần tử ra khỏi Stack và gán vào mảng ban đầu theo thứ tự ngược lại
        for (int i = 0; i < arr.length; i++){
            arr[i] = integerStack.pop();
        }
        System.out.println("Mảng ban đầu sau khi đổi ngược giá trị: " + Arrays.toString(arr));
    }
}