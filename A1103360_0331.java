import java.util.*;

public class A1103360_0331{
    public static void main(String[] args) throws Exception{
        Animal.showinfo();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("雪寶",1.1,52,100));
        animals.add(new Animal("驢子",1.5,99,200));

        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("阿克", 1.9, 80, 150, "男"));
        humans.add(new Human("漢斯", 1.8, 78, 130, "男"));
        humans.add(new Human("安那", 1.7, 48, 120, "女"));

        ArrayList<Snow> snows = new ArrayList<Snow>();
        snows.add(new Snow("愛沙", 1.7, 50, 120, "女", "Yes"));
        
        System.out.println();

        for(Animal animal : animals){
            animal.show();
            System.out.println();
        }

        for(Human human : humans){
            human.show();
            System.out.println();
        }

        for(Snow snow : snows){
            snow.show();
            System.out.println();
        }

        Scanner input = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print(animal.getName() + " 輸入時間x(分鐘)：");
            double x = input.nextDouble();
            System.out.print(animal.getName() + " 輸入加速度y(若無則輸入0)：");
            double y = input.nextFloat();
            double distance=animal.distance(x,y);
            System.out.println(animal.getName() + " 奔跑的距離：" + distance);
            
            System.out.println();
        }

        for (Human human : humans) {
            System.out.print(human.getName() + " 輸入時間x(分鐘)：");
            double x = input.nextDouble();
            System.out.print(human.getName() + " 輸入加速度y(若無則輸入0)：");
            double y = input.nextFloat();
            double distance=human.distance(x,y);
            System.out.println(human.getName() + " 奔跑的距離：" + distance);
            
            System.out.println();
        }

        for (Snow snow : snows) {
            System.out.print(snow.getName() + " 輸入時間x(分鐘)：");
            double x = input.nextDouble();
            System.out.print(snow.getName() + " 輸入加速度y(若無則輸入0)：");
            double y = input.nextFloat();
            double distance=snow.distance(x,y);
            System.out.println(snow.getName() + " 奔跑的距離：" + distance);
            
            System.out.println();
        }
    }
}