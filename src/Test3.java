import java.util.Scanner;
// Задание 5

public class Test3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое натуральное число :");
        float q = scan.nextInt();
        if (q == 0) {
            System.out.println(" Число 0 не является натуральным!!");
        }
        System.out.println("Введите второе натуральное число :");
        float w = scan.nextInt();
        if (w == 0) {
            System.out.println("Число 0 не является натуральным числом!!");
        }
        float result;
        result = (q / w);
        System.out.println("Результат : " +result );



    }
}
