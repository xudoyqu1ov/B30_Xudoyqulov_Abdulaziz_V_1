import java.lang.reflect.Array;
import java.util.Objects;

public class WordsArray {
    public int returnCouple(String[] words){
        int count = 0;
        for (int i = 0; i < words.length; i++) {

            String check = "";
            String res = "";
            res = words[i];
            for (int j = res.length(); j >= 0; j--) {
                check += res.charAt(j);
            }
            for (int j = i; j < words.length; j++) {
                if (Objects.equals(check, words[j])){
                    count++;
                }
            }


        }
        return count;
    }
}
