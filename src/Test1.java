import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   System.out.print("Как я могу к Вам обращаться?");
    String username = scan.nextLine();
    System.out.println("Привет, " + username);
    System.out.print( username + " ,какой товар ты хочешь приобрести?");
    String nametov1 = scan.nextLine();
    System.out.print("Какое количество хочешь приобрести?");
    float koltov1 = scan.nextInt();
    float howmon1 = 11;
    double res2 = 0.85;
    Scanner scan1 = new Scanner(System.in);
    double res1 = ((howmon1 * koltov1) * res2) ;
    System.out.println( username + " ,какой товар ещё хочешь купить?");
    String nametov2 = scan1.nextLine();
    System.out.print("Какое количетво хочешь купить?");
    float koltov2 = scan1.nextInt();
    float howmon2 = 25;
    float res3 = koltov2 * howmon2;
    double itog1 = res1 + res3;


    Scanner scan3 = new Scanner(System.in);
    System.out.println("Хотите поучаствовать в акции?");
    String answer = scan3.nextLine();
    if (answer.equals("Да")) {
     System.out.println("Если вы покупаете " + nametov1 + " и " + nametov2 + "вместе, то действует скидка 10% на оба товара!");
     double res4 = 0.9;
     double res6 = 0.1;
     double res5 = (((koltov1 * howmon1) + (koltov2 * howmon2 ))* res4);
     double res7 = (((koltov1 * howmon1) + (koltov2 * howmon2 ))* res6);
     System.out.println("Стоимость товара со скидкой " + res5 + "byn");
     System.out.println("Скидка составила " + res7 + " byn");
    } else {
     System.out.println("Итоговая стоимость:" +itog1 +" byn" );


    }
    //
   //  boolean stok = "Да";
   //  if




     //System.out.println("Итоговая стоимость:" +itog1 +"byn" );





    }
}