import java.util.Scanner;
public class A1103360_0224_2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        float tempC;
        System.out.print("請輸入攝氏溫度:");
        tempC = input.nextFloat();

        float tempF;
        tempF=(tempC*9/5) + 32;

        System.out.printf("%.2f 為攝氏 %.2f 的華氏溫度",tempF,tempC);
    }
}