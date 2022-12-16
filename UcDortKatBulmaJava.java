import java.util.Scanner;
public class UcDortKatBulmaJava {
    public static void main(String[] args) {
        int maxValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz: ");
        maxValue=input.nextInt();
        for (int i=0 ; i<=maxValue; i++){
            if (i%12==0){
                System.out.println(i+" Sayısı 3 ve 4 tam bölünüyor ");
            }
        }


    }
}