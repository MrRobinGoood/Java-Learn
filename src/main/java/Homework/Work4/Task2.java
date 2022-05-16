package Homework.Work4;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String str = "YeOU42fgshAfdghsRfhdgEN6f7ds5Ifdy32C0ofsE";
        System.out.println("Исходная строка " + str);
        String completeStr = task2.searchAndCollectUppercaseLettersOfStr(str);
        System.out.println("Полученная строка " + completeStr);
    }

    public String searchAndCollectUppercaseLettersOfStr(String str) {
        char[] array = str.toCharArray();
        String recordStr = new String();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(array[i])) {
                recordStr += array[i];
            }
        }
        return recordStr;
    }
}
