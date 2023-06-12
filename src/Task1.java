// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
// падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(showFloat());
    }

    public static float showFloat() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число");
            return Float.parseFloat(scanner.nextLine());
        } catch (Exception e) {
            System.err.println("Неверное значение");
            return showFloat();
        }
    }
}