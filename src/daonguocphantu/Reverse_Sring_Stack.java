package daonguocphantu;

import java.util.Stack;
public class Reverse_Sring_Stack {

        public static void main(String[] args) {
            reverseStringStack("hà Văn Dũng");
        }
        public static String reverseStringStack(String str){
            String output = "";
            Stack<String> stringStack = new Stack<>();

            for (int i = 0; i < str.length(); i++){
                stringStack.push(String.valueOf(str.charAt(i)));
            }
            System.out.println("Các ký tự được đưa vào mảng Stack: " + stringStack);
//        for (int i = 0; i < str.length(); i++){
//            output += stringStack.pop();
//        }
            while (!stringStack.isEmpty()){
                output += stringStack.pop();
            }
            System.out.println("Chuỗi được đảo ngược: " + output);
            return output;
        }
    }

