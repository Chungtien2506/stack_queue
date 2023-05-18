package demsolanxuathien;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
public class CountCharInMap {
    public static void main(String[] args) {
        String text = "abcde.hoi lam gi.chung tien";


        TreeMap<String, Integer> wordCount = new TreeMap<>(); // Tạp map mới mang 2 kiểu dữ liệu

        String[] words = text.split("[\\s\\p{Punct}]+"); // tách tất cả chữ thành 1 mảng xóa ký tự, bao nhiêu chữ bấy nhiêu phần tử

        for (String word : words){ //vòng lặp duyệt qua các phần tử trong mảng words
            word = word.toLowerCase();
            if (wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1); // Chưa có Value = 0 + 1 có rồi sẽ là 1 + 1 tại vì value đang khai báo là kiểu số.
            } else {
                wordCount.put(word, 1);
            }
        }
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i].toLowerCase();
//            if (wordCount.containsKey(word)) {
//                wordCount.put(word, wordCount.get(word) + 1); // 1 chữ hiểu là 1 + 1 chưa có chữ nào thì hiểu 0 + 1
//            } else {
//                wordCount.put(word, 1);
//            }
//        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //put() thêm phần tử và cập nhập lại giá trị phần tử
        //get() truy cập phần tử
        //remove() xóa phần tử

        //duyệt các phần tử dùng Map.entry - tree.entrySet -> entry.getkey, getvalue
    }
    }

