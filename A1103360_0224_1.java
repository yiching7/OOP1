import java.util.Scanner;
public class A1103360_0224_1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("請輸入一個整數:");
        number = input.nextInt();

        if(number % 2 == 1){
            System.out.printf("%d是奇數",number);
        }
        else{
            System.out.printf("%d是偶數",number);
        }
    }
}