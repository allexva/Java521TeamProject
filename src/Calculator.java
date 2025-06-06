import java.util.Random;

public class Calculator {
    //todo: Создание СТАТИЧЕСКИХ методов считающих
    // какие-либо функции обычного калькулятора
    // КАЖДЫЙ делает свой метод

    //todo: 1. Сложение двух чисел
    //todo: 2. Вычитание двух чисел
    //todo: 3. Умножение двух чисел Дмитрий Портнов
    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    //todo: 4. Деление двух чисел (с проверкой деления на ноль) Дмитрий Портнов
    public static double division(double divisible, double divider) {
        if (divider != 0) {
            return divisible / divider;
        }
        throw new IllegalArgumentException("Делить на ноль нельзя!");
    }

    //todo: 5. Возведение в степень Болеев Руслан
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    //todo: 6. Квадратный корень числа Егор Дюкин
    public static double square(double n) {
        if (n < 0)
            throw new IllegalArgumentException("n must be >= 0");
        return Math.sqrt(n);
    }

    //todo: 7. Процент от числа Валерия Смирнова
    public static double calculatePercentage(double part, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("Total must be > 0");
        }
        return (part / total) * 100;
    }

    //todo: 8. Факториал числа (рекурсивно или итеративно) Илья Сырков, a.k.a Miracle-Masterpiece
    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    //todo: 9. Остаток от деления (деление по модулю)
    //todo: 10. Максимум из двух чисел Виктор Кулаков, Vint
    public static int findBigger(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("a must not equal b");
        }
        return Math.max(a, b);
    }
    //todo: 11. Минимум из двух чисел Вячеслав Коликов
    //todo: 12. Абсолютное значение числа (число по модулю) Алексей Слепов
    //todo: 13. Логарифм по основанию 10 (проверка на отрицательность с выбрасыванием исключения) Елена Коптева
    //todo: 14. Округление числа до N знаков после запятой (проверка на отрицательность N с выбрасыванием исключения) Валерий Баранов
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
