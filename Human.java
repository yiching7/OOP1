public class Human extends Animal{
    private String gender;

    public Human(String name,double height,double weight, double speed, String gender){
        super(name,height,weight,speed);
        this.gender = gender;
    }

    public void show(){
        super.show();
        System.out.println("性別：" + gender);
    }
}