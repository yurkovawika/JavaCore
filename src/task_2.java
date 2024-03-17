//Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.

public class task_2 {
    public static void findDifference(int[] arr) {
        if (arr.length <= 1) {
            System.out.println("Разница между самым большим и самым маленьким элементами массива = 0");
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        int res = max - min;
        System.out.println("Разница между самым большим и самым маленьким элементами массива = " + res);

    }
}