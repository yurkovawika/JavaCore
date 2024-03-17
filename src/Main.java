import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3);
        }
        task_1.countEvens(arr);
        task_2.findDifference(arr);
        if (task_3.zeroValue(arr)) {
            System.out.println("В переданном массиве есть два соседних элемента, с нулевым значением");
        }
        else System.out.println("В переданном массиве нет двух соседних элементов, с нулевым значением");


    }
}