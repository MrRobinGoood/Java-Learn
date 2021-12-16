package Homework.Work4;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        String str = "mama myla ramu";
        System.out.println(str);
        String completeStr = task5.searchUniqueSymbols(str);
        System.out.println(completeStr);
    }

    public String searchUniqueSymbols(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (!stringBuilder.toString().contains(String.valueOf(strArray[i]))) {
                stringBuilder.append(strArray[i]);
            }
        }
        String completeStr = stringBuilder.toString();
        return completeStr;
    }
}
