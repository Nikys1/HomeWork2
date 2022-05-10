import java.util.Scanner;

public class Test4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3-х значное натуральное число :");
        int a = scan.nextInt();
        if (a < 99){
            System.out.println("Нужно ввести 3х значное число!");
        }
        else {
            int b;
            b = (a / 100);
            int c;
            c = ((a / 10) - (b * 10));
            int k;
            k = (a - (b * 100 + c * 10));
            int result;
            result = (b + c + k);
            System.out.println("Сумма цифр числа = " + result);
        }

    }
}
