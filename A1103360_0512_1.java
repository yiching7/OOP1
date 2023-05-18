import java.util.*;

class TimerThread extends Thread{
    Eat e;
    String name;
    Random random;

    public TimerThread(Eat e,String name){
        this.e=e;
        this.name=name;
        this.random=new Random();
    }
    public void run(){
        int numDumplings = random.nextInt(41) + 10; // 隨機數量，10到50
        int dumplingType = random.nextInt(3); // 隨機種類（0代表豬肉水餃，1代表牛肉水餃，2代表蔬菜水餃）

        e.eat(name, numDumplings, dumplingType);
    }
}
class Eat{
    int pork=5000;
    int beef=3000;
    int vegetable=1000;
    boolean isSoldOut = false;

    public synchronized void eat(String eater,int numDumplings,int dumplingType){
        if(isSoldOut){
            return;
        }
        switch(dumplingType){
            case 0: // 豬肉
                if(numDumplings <= pork){
                    pork -= numDumplings;
                    System.out.print("豬肉水餃剩:");
                    System.out.println(pork);
                }
                else{
                    pork=0;
                    System.out.println("豬肉沒了");
                }
                break;
            case 1: // 牛肉
                if(numDumplings <= beef){
                    beef -= numDumplings;
                    System.out.print("牛肉水餃剩:");
                    System.out.println(beef);
                }else{
                    beef=0;
                    System.out.println("牛肉沒了");
                }
                break;
            case 2: // 蔬菜
                if(numDumplings <= vegetable){
                    vegetable -= numDumplings;
                    System.out.print("蔬菜水餃剩:");
                    System.out.println(vegetable);
                }else{
                    vegetable=0;
                    System.out.println("蔬菜沒了");
                }
                break;
            default:
                break;
        }
        if(pork <= 0 && beef <= 0 && vegetable <= 0){
            System.out.println("都賣完了，明天再來");
            isSoldOut = true;
            System.exit(0);
        }

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void startEat(int customer){
        for(int i=1;i<=customer;i++){
            TimerThread eater= new TimerThread(this,"eater"+i);     
            eater.start();
        }
    }
}

public class A1103360_0512_1{
    public static void main(String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Eat e = new Eat();
        System.out.print("請輸入同時的顧客數量: ");
        int customer=input.nextInt();
        e.startEat(customer);
    }
}