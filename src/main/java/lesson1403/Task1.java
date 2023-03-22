package lesson1403;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static lesson1403.Task2.reverseList;

public class Task1 {
    //    1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    public static void main(String[] args) {
        addedInputStringLinkedListInConsole();

    }

    private static void addedInputStringLinkedListInConsole() {
        Scanner scanner = new Scanner(System.in);
        List<String> dataList = new LinkedList<>();
        while (true) {
            System.out.print("Введите текс: ");
            String str = scanner.nextLine();

            if (str.trim().length() == 0) {
                System.out.println("Вы ввели пустую строку!");
                continue;
            }
            if (str.equalsIgnoreCase("print")) {
                System.out.println(reverseList(dataList));
                continue;
            }
            if (str.equalsIgnoreCase("revert")) {
                int lastInd = dataList.size() - 1;
                dataList.remove(lastInd);
                System.out.println(reverseList(dataList));
                continue;
            }
            if (str.equalsIgnoreCase("stop")) {
                break;
            }

            dataList.add(str);
        }
        scanner.close();
    }
}
