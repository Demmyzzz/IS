import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

//        int[] arr = new int[6];
        int[][] arr2 = new int[6][2];

        for (int i = 0; i < 6; i++) {
            list2.add((int) (Math.random() * 10));
        }
        System.out.println(list2);
        System.out.println("");
        //sort(arr,arr2 );
        sorti(list, list2, arr2);
    }

    private static void sorti(ArrayList<Integer> list, ArrayList<Integer> list2, int[][] arr2) {
        int maxRepeat = 0;
        for (int i = 0; i < list2.size(); i++) {
            int sum = 0;

            for (int b = 0; b < list2.size(); b++) {
                if (list2.get(i) == list2.get(b)) {
                    sum++;
                }
            }

            arr2[i][0] = list2.get(i);
            arr2[i][1] = sum;

            System.out.print(arr2[i][0] + " element | ");
            System.out.println(arr2[i][1] + " repeat | ");
            System.out.println(Arrays.toString(arr2[i]));
            if (arr2[i][1] > maxRepeat) {
                maxRepeat = arr2[i][1];
            }
        }
        for (int i=0;i<list2.size();i++){
            if (arr2[i][1]==maxRepeat){
                System.out.print(arr2[i][0]+" - element ");
                System.out.print(arr2[i][1]+" - repeat | ");
                int num = arr2[i][0];
                findMore(num,list,list2);
            }
        }
        for (int i=0;i<6;i++){
                if (arr2[i][1]<maxRepeat){
                    list.add(arr2[i][0]);
                }
            }
        System.out.println(list);
    }
    private static void findMore(int num, ArrayList<Integer> list, ArrayList<Integer> list2) {
        for(int i=0;i<list2.size();i++){
            if (list2.get(i)==num){
                list.add(num);
                list2.remove(i);
            }

        }
    }
}
