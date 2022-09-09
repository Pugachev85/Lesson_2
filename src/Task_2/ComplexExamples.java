package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplexExamples {

    /*
    Task2

        [3, 4, 2, 7], 10 -> [3, 7] - вывести пару именно в скобках, которые дают сумму - 10
     */
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7, 8};
        int searchedSum = 10;
        System.out.println(findNums(array, searchedSum));
    }

    public static List<Integer> findNums(int[] array, int searchedSum) {
        if (array == null) return null;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == searchedSum) {
                    result.add(array[i]);
                    result.add(array[j]);
                    return result;
                }
            }
        }
        return null;
    }
}
