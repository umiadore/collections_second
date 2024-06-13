import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Есть список оценок учеников
посчитайте среднее значени оценок
найдите оценку, котора является второй среди самых лучших
cистема 100бальная

 */
public class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1,101);
            list.add(number); // list [i] = number - так выглядел бы если бы это был массив
        }
        System.out.println(list);

        int sum =0;
        for (int i = 0; i < list.size(); i++) {

            int element = list.get(i); // the same as  list [i] in normal array
            sum += element;
        }
        System.out.println("Среднее значение: " + sum /list.size());

        int max =Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < list.size(); i++) {

            int element = list.get(i);
            if (element > max) {
                secondMax = max;
                max = element;
            } else if (element > secondMax) {
            secondMax = element;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Второй максимальный элемент: " + secondMax);
    }
}