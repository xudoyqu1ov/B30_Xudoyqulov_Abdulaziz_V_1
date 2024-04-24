import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Custom<Integer> list = new Custom<>();
        list.add(4);
        list.add(8);
        list.add(5);
        System.out.println(list.get(2));
        System.out.println(list.contains(8));
        list.remove(1);
        System.out.println(list.get(1));
        String[] words = {"sd", "re", "ds", "fr", "er", "as"};
        int i = WordsArray.returnCouple(words);
        int[] nums = {8,4,1};
        System.out.println(Task.evenOrOdd(nums));
        System.out.println(i);
    }

}