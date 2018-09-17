import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int[][] arr2 = new int[6][2];
        for (int i=0;i<arr.length;i++){ arr[i]= (int) (Math.random()*10);System.out.println(arr[i]); }
        System.out.println("");
        sort(arr,arr2 );
    }

    private static void sort(int[] arr, int[][] arr2) {
        int maxRepeat=0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            int sum=0;

            for (int b=0;b<arr.length;b++){ if (arr[i]==arr[b]) { sum++; } }

            arr2[i][0]=arr[i];
            arr2[i][1]=sum;

            System.out.print(arr2[i][0]+" element | ");
            System.out.print(arr2[i][1]+" repeat | ");
            if (arr2[i][1]>maxRepeat){
                maxRepeat=arr2[i][1];
            }
            System.out.print(maxRepeat+" max repeat");
            System.out.println(Arrays.toString(arr2[i]));
        }
            for (int i=0;i<arr.length;i++){
                if (arr2[i][1]==maxRepeat){
                    System.out.print(arr2[i][0]+" - element ");
                    System.out.print(arr2[i][1]+" - repeat | ");
                    list.add(arr2[i][0]);
                    for (int b=0;b<arr.length;b++) {
                        if (arr[b] == arr2[i][1]) {
                            list.add(arr[b]);
                        }
                        for (int o = 0; o < arr.length; o++) {
                            if (arr[b]==list.indexOf(o)){
                                list.remove(list.get(list.indexOf(o)));
                            }
                        }
                    }
                }
            }
            for (int i=0;i<arr.length;i++){
                if (arr2[i][1]<maxRepeat){
                    list.add(arr2[i][0]);
                }
            }
        System.out.println(list);
    }
}