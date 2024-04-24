import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

    }

    static public ArrayList<Integer> evenOrOdd(int[] nums){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int temp2 = nums[i];
            while (temp % 2 == 0){
                if (!res.contains(temp)) {
                    res.add(temp);
                }
                temp /= 2;
                if (temp ==1 && !res.contains(temp)){
                    res.add(temp);
                    break;
                }
            }
            if (temp2 % 2 != 0){

                if (res.contains(temp2)) {
                    res.add(temp2);
                }
                temp2 *= 2;
                if (res.contains(temp2)) {
                    res.add(temp2);
                }
            }
        }
        return res;
    }
}
