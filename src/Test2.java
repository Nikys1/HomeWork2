import java.util.Scanner;

public class Test2 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение 1-го катета : ");
        double x = scan.nextInt();
        System.out.println("Введите значение 2-го катета : ");
        double y = scan.nextInt();
        double result;
        result = Math.sqrt((x * x) + (y * y));
        System.out.println("Гиптенуза = " +result);
        }

    }

