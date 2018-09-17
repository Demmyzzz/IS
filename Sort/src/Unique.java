import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        int[] array = {2,4,6,6,4,2};
        HashSet<Integer> uniqueValue = new HashSet<>();
        for (int value : array){
            uniqueValue.add(value);
        }
        System.out.println(uniqueValue);
    }
}
