//Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
public class task_1 {
    public static void countEvens(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            System.out.print("[" + j + "] ");
            if (j % 2 == 0) sum++;
        }
        System.out.println("\n" + "Количество четных элементов в массиве = " + sum);

    }
}