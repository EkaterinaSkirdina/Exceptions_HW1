import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
 * Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением "Деление на ноль недопустимо".
 * Иначе выведите результат деления на экран.
 */

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите делимое: ");
            int num1 = sc.nextInt();
            System.out.print("Введите делитель: ");
            int num2 = sc.nextInt();
            System.out.printf("%d / %d = %d", num1, num2, divide(num1, num2));
        } catch (InputMismatchException e){
            System.out.println("Не корректный ввод!");
        }
    }

    public static int divide(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return num1 / num2;
    }
}