package Task_3;


public class ComplexExamples {
    /*
    Task3
        Реализовать функцию нечеткого поиска
                fuzzySearch("car", "ca6$$#_rtwheel"); // true
                fuzzySearch("cwhl", "cartwheel"); // true
                fuzzySearch("cwhee", "cartwheel"); // true
                fuzzySearch("cartwheel", "cartwheel"); // true
                fuzzySearch("cwheeel", "cartwheel"); // false
                fuzzySearch("lw", "cartwheel"); // false
     */
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch(null , null)); // false
    }

    private static boolean fuzzySearch(String searchRequest, String string) {
        if (searchRequest == null || string == null) return false;
        int prevEntry = -1;
        for (int i = 0; i < searchRequest.length(); i++){
            int curEntry = string.indexOf(searchRequest.charAt(i), prevEntry +1);
            if (curEntry != -1 && curEntry > prevEntry){
                prevEntry = curEntry;
            }else return false;
        }
        return true;
    }
}
