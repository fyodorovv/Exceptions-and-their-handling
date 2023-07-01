import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у пользователя его возраст.
 * Если введенное значение не является числом, выбросите исключение NumberFormatException
 * с сообщением "Некорректный ввод". Иначе выведите возраст на экран.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        String input = sc.nextLine();
        try {
            int age = Integer.parseInt(input);
            System.out.printf("Ваш возраст = %d", age);
        }catch (NumberFormatException e){
            // Если строго придерживаться задания
            // (хотя мне кажется странным формировать новое исключение на полученное исключение :),
            // я бы заменил просто на System.out.println())
            throw new NumberFormatException("Не корректный ввод");
        }
    }
}
