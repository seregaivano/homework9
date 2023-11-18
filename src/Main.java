public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() { // Объявить метод «сгенерироватьМассив»
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int element : arr) {
            total += element;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        int [] arr = generateRandomArray();
        int min = 200000;
        int max = 100000;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }
    public static void task3 () {
        int [] arr = generateRandomArray();
        double all = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            all = all + arr[i];
        }
        double srednee = all/ generateRandomArray().length;
        System.out.println("Средняя сумма трат составила " + srednee + " рублей");
    }
    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}







