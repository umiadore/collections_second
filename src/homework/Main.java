package homework;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Пользователь вводит в консоли число - количество данных, которые будет вводить
2. Далее пользователь начинает ввод данных через консоль (кол-во данных = числу, введенному ранее)
3. В каждой строке пользователь вводит:
3.1 Количество денег, которые он хочет положить на вклад
3.2 Процент по вкладку
3.3 Количество лет (длительность вклада)

Необходимо:
1. Посчитать, сколько пользователь заработает с каждого вклада
2. Найти самый выгодный вклад (по наибольшему доходу от вклада)
3. Найти среднюю прибыль с каждого вклада

!!!Решать с использованием листа (ArrayList или LinkedList)!!!
 */
public class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of data that wil be entered:");
        int data = scanner.nextInt();
    }
}
