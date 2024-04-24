import java.lang.reflect.Array;
import java.util.Objects;

public class WordsArray {
    public static int returnCouple(String[] words){
        int count = 0;
        for (int i = 0; i < words.length-1; i++) {

            String check = "";
            String res = "";
            res = words[i];
            for (int j = res.length()-1; j >= 0; j--) {
                check += res.charAt(j);
            }
            for (int j = i+1; j < words.length; j++) {
                if (Objects.equals(check, words[j])){
                    count++;
                }
            }


        }
        return count;
    }
}
