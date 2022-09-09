package Task_2;

import java.util.Arrays;
import java.util.List;

public class ComplexExamples {

    /*
    Task2

        [3, 4, 2, 7], 10 -> [3, 7] - вывести пару именно в скобках, которые дают сумму - 10
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, null, 4, 2, 7, 8);
        List<Integer> list2 = Arrays.asList(3, null, 4, 2, 9, 8);
        int searchedSum = 10;
        System.out.println(findNums(list, searchedSum));
        System.out.println(findNums(list2, searchedSum));
    }

    public static String findNums(List<Integer> list, int searchedSum) {
        if (list == null) return null;
        for (Integer curNum : list) {
            if (curNum == null) continue;
            if (list.contains(searchedSum-curNum)) {
                return String.format("[%d,%d]", curNum, searchedSum-curNum);
            }
        }
        return null;
    }
}