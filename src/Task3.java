// Дан следующий код, исправьте его там, где требуется

public class Task3 {
    public static void main(String[] args){
        try {
            int a = 90;
            int b = 3;
            printDiv(a, b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль запрещено!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void printDiv(Integer a, Integer b) {
        System.out.println(a / b);
    }

}