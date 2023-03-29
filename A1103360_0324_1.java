import java.util.Scanner;
import java.util.ArrayList;

class Animal{
    String name;
    double height;
    double weight;
    double speed;

    Animal(String name,double height,double weight,double speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

    void show(){
        System.out.println("姓名：" + this.name);
        System.out.println("身高：" + this.height + "公尺");
        System.out.println("體重：" + this.weight + "公斤");
        System.out.println("速度：" + this.speed + "公尺/分鐘");

    }

    double distance(double x){
        x=x*this.speed;
        return x;
    }

    double distance(double x,double y){
        x=x*this.speed*y;
        return x;
    }

    String getName(){
        return this.name;
    }
}

public class A1103360_0324_1{
    public static void main(String[] args){
        /*Animal[] animals={
            new Animal("雪寶",1.1,52,100),
            new Animal("驢子",1.5,99,200),
            new Animal("安那",1.7,48,120),
            new Animal("愛沙",1.7,50,120)};
        */

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("雪寶",1.1,52,100));
        animals.add(new Animal("驢子",1.5,99,200));
        animals.add(new Animal("安那",1.7,48,120));
        animals.add(new Animal("愛沙",1.7,50,120));

        for(Animal animal : animals){
            animal.show();
            System.out.println();
        }

        Scanner input = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print(animal.getName() + " 輸入時間x(分鐘)：");
            double x = input.nextDouble();
            System.out.print(animal.getName() + " 輸入加速度y(若無則輸入0)：");
            double y = input.nextFloat();

            if (y == 0) {
                System.out.println(animal.getName() + " 奔跑的距離：" + animal.distance(x));
            } else {
                System.out.println(animal.getName() + " 奔跑的距離：" + animal.distance(x,y));
            }
            System.out.println();
        }

    }
}