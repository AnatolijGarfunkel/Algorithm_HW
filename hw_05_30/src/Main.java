import java.beans.PropertyEditorSupport;

public class Main {
    public static void main(String[] args) {
    /*
    1)
    Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
    Операцией возведения в степень пользоваться нельзя!

    Ввод    Вывод
    8       YES
    3       NO
     */

        System.out.println(raiseProof(300));

    /*
    2)
    Дано натуральное число N. Вычислите сумму его цифр.
    При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
     */

        System.out.println(sum(637));

    /*
    3)
    Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
    */

        fib(6);

    /*
    4)
    Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
    */
        String s = "adia";
        palindrome(s);
    }
//  1)__________________________________________________________________________________________________________________
    public static String raiseProof(int n) {
        String result;
        if (n == 1)
            return "YES";
        else if (n % 2 != 0)
            return n + " / 2 - NO";
        System.out.println(n + " / 2 = " + n / 2);
        result = raiseProof(n / 2);
        return result;
    }

//  2)__________________________________________________________________________________________________________________
    public static int sum (int n) {
        int result;
        int digit = n % 10;
        int temp;
        if (n == 0)
            return 0;
        temp =  sum (n / 10);
        result = digit + temp;
        System.out.println(result);
        return result;
    }

//  3)__________________________________________________________________________________________________________________
    public static void fib(int n) {
        n ++;
        int first = 0;
        int second = 1;
        int subtotal = first + second;
        calculateFib(n, first, second, subtotal);
    }

    public static void calculateFib(int n, int first, int second, int subtotal) {
        if (n == 0) {
            return;
        }
        System.out.print(first + " ");
        subtotal = first + second;
        first = second;
        second = subtotal;
        calculateFib(n - 1, first, second, subtotal);
    }


//  4)__________________________________________________________________________________________________________________
    public static void palindrome(String s) {
        checkPalindrome(s, 0, s.length() - 1);
    }

    public static void checkPalindrome(String s, int left, int right) {
        if (s.charAt(left) != s.charAt(right)) {
            System.out.println("NO");
            return;
        }
        if (left == right || left + 1 == right) {
            System.out.println("YES");
            return;
        }
        checkPalindrome(s, left + 1, right - 1);
    }
}
























