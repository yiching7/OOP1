import java.util.*;
public class A1103360_0421_2{
    public static void main(String [] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入時間(YYYY/MM/DD or MM/DD/YYYY):");
        String time = input.next();

        if(time.matches("[0-9]{4}[/]{1}[0-9]{2}[/]{1}[0-9]{2}")||time.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
            int year = 0, month = 0, day = 0;
            String[] parts = time.split("/");
            if (parts.length == 3) {
                if (parts[0].length() == 4) {
                    year = Integer.parseInt(parts[0]);
                    month = Integer.parseInt(parts[1]);
                    day = Integer.parseInt(parts[2]);
                } else {
                    year = Integer.parseInt(parts[2]);
                    month = Integer.parseInt(parts[0]);
                    day = Integer.parseInt(parts[1]);
                }
            }

            if (year > 0 && month > 0 && month <= 12 && day > 0) {
                if (month == 2) {
                    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {      //是閏年
                        if (day > 29) {
                            System.out.println("該月份沒有 " + day + " 日");
                            return;
                        }
                    } else {
                        if (day > 28) {
                            System.out.println("該月份沒有 " + day + " 日");
                            return;
                        }
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        System.out.println("該月份沒有 " + day + " 日");
                        return;
                    }
                } else {
                    if (day > 31) {
                        System.out.println("該月份沒有 " + day + " 日");
                        return;
                    }
                }
                System.out.println(time);
            }
        }
        else{
            System.out.println("時間格式不正確");
        }
    }
}