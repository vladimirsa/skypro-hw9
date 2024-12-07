public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int[] arr1= {1000, 2000, 3000, 4000, 5000};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");

        int[] arr2 = {1000, 2000, 3000, 4000, 5000};
        int min = arr2[0];
        int max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Задание 3");

        int[] arr3 = {1000, 2000, 3000, 4000, 5000};
        int monthSum = 0;
        for (int i = 0; i < arr3.length; i++) {
            monthSum += arr3[i];
        }
        double average = (double) monthSum / arr3.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}