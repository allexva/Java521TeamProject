import java.util.Random;
import java.util.Scanner;

public class Calculator {
    //todo: Создание статических методов считающих
    // какие-либо функции обычного калькулятора
    // КАЖДЫЙ делает свой метод

    //todo: 1. Сложение двух чисел
    //todo: 2. Вычитание двух чисел
    //todo: 3. Умножение двух чисел
    //todo: 4. Деление двух чисел (с проверкой деления на ноль)
    //todo: 5. Возведение в степень
    //todo: 6. Квадратный корень числа Егор Дюкин
    //todo: 7. Процент от числа
    //todo: 8. Факториал числа (рекурсивно или итеративно) Илья Сырков
    //todo: 9. Остаток от деления (деление по модулю)
    //todo: 10. Максимум из двух чисел Виктор Кулаков
    //todo: 11. Минимум из двух чисел
    //todo: 12. Абсолютное значение числа (число по модулю)
    //todo: 13. Логарифм по основанию 10 (проверка на отрицательность с выбрасыванием исключения) Елена Коптева
    //todo: 14. Округление числа до N знаков после запятой (проверка на отрицательность N с выбрасыванием исключения)
    //todo: 15. Генерация случайного числа в заданном диапазоне (проверка на разницу мин макс с выбрасыванием исключения) Андрей Вожегов

    //TODO 15:
    public static int randomNumber(int a, int b) {
        try {
            if (a >= b) {
                throw new IncorrectNumberOrder("The first number cannot be greater than or equal to the second number");
            }
            Random random = new Random();
            return random.nextInt(b - a + 1) + a;
        } catch (IncorrectNumberOrder incorrectNumberOrder) {
            System.out.println("Error! " + incorrectNumberOrder.getMessage());
            return -1;
        }
    }
}
