import java.util.*;
public class A1103360_0421_1{
    public static void main(String [] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入電子郵件信箱:");
        String mail = input.next();

        if(mail.matches("[a-z]+[@]{1}[a-z]+[.]{1}[a-z]+")){
            System.out.println(mail);
        }
        else{
            System.out.println("電子郵件信箱格式不正確");
        }
    }
}