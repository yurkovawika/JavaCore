//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class task_3 {
    public static boolean zeroValue(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
