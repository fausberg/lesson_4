import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task_1();
        //Task_2();
        //Task_3();
        Task_4();
    }

    public static void Task_1() {
        System.out.println("Введите номер месяца чьё количество дней хотите узнать");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr_days = new int[12];
        arr_days[0] = 31;
        arr_days[1] = 28;
        arr_days[2] = 31;
        arr_days[3] = 30;
        arr_days[4] = 31;
        arr_days[5] = 30;
        arr_days[6] = 31;
        arr_days[7] = 31;
        arr_days[8] = 30;
        arr_days[9] = 31;
        arr_days[10] = 30;
        arr_days[11] = 31;

        String[] arr_month = new String[12];
        arr_month[0] = "январь";
        arr_month[1] = "февраль";
        arr_month[2] = "март";
        arr_month[3] = "апрель";
        arr_month[4] = "май";
        arr_month[5] = "июнь";
        arr_month[6] = "июль";
        arr_month[7] = "август";
        arr_month[8] = "сентябрь";
        arr_month[9] = "октябрь";
        arr_month[10] = "ноябрь";
        arr_month[11] = "декабрь";

        System.out.println(arr_month[n - 1] + " - " + arr_days[n - 1] + " дней");

        System.out.println();
    }

    public static void Task_2() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(50) + 100 ;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int max = arr[0];

        int min = arr[0];

        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        int in_min = 0;
        int in_max = 0;

        for(int i = 0; i < n; i++){
            if(min == arr[i]){
                in_min = i;
            } else if (max == arr[i]) {
                in_max = i;
            }
        }

        int kol = 0;

        if(in_max > in_min){
            kol = in_max - in_min - 1;
        }else{
            kol = in_min - in_max - 1;
        }

        System.out.println(max);

        System.out.println();

        System.out.println(min);

        System.out.println();

        System.out.println(kol);
    }

    public static void Task_3(){
        String[] arr = new String[]{"fadf", "feafds", "gdhgff"};
        int[] arr_1 = new int[5];
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            arr_1[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(arr_1)); // вывод массива в строку с квадратными скобками

        for(String it: arr){        //foreach  перебор массива без индекса
            System.out.println(it);
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr_1);
        int k = Arrays.binarySearch(arr_1, 5);

        System.out.println(k);
        System.out.println(Arrays.toString(arr_1));
    }

    public static void Task_4(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//       // int n = scanner.nextInt();
//        int sum = 0;
//        for(int i = 0; i < n; i++){
//            if(i % 2 == 1){
//                sum += i;
//            }
//        }
        //System.out.println(sum);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        
        int pum = 0;
        for(int i = 0; i < 10; i++) {
            for (int g = 0; g < 10; g++) {
                if (arr[g] > arr[i]) {
                    pum = arr[i];
                    arr[i] = arr[g];
                    arr[g] = pum;
                    continue;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}