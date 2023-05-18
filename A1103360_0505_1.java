import java.util.*;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class A1103360_0505_1{
    public static void main(String [] args) throws Exception{
        int[] winningNumbers = {3, 5, 13, 22, 36, 45};
        Scanner input = new Scanner(System.in);
        int[] inputNum = new int[6];
        System.out.println("請輸入六個數字(1~49): ");
        for (int i = 0; i < 6; i++) {
            try {
                int num = input.nextInt();
                if (num < 1 || num > 49) { // 輸入數字超出範圍
                    throw new MyException("輸入的數字必須介於1和49之間。");
                }
                inputNum[i] = num;
            } catch (MyException e) {
                System.out.println(e);
            }
        }

        Arrays.sort(inputNum);
        System.out.println("中獎號碼為: " + Arrays.toString(winningNumbers));
        System.out.println("你輸入的數字為: " + Arrays.toString(inputNum));
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (Arrays.binarySearch(winningNumbers, inputNum[i]) >= 0) {
                count++;
            }
        }
        if(count==6){
            System.out.println("恭喜中獎!");
        }
        else{
            System.out.println("傷心 沒中獎!");
        }
    }
}