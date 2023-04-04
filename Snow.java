public class Snow extends Human{
    private String skill;
    
    public Snow(String name,double height,double weight, double speed, String gender, String skill){
        super(name,height,weight,speed,gender);
        this.skill = skill;
    }
 
    public void show(){
        super.show();
        System.out.println("冰凍技能：" + skill);
    }

    public double distance(double x){
        double speed;
        speed=super.getSpeed();
        x=x*speed*2;
        return x;
    }

    public double distance(double x,double y){
        double speed;
        speed=super.getSpeed();
        if(y==0){
            return distance(x);
        }
        else{
            x=x*speed*y*2;
        return x;
        } 
    }
}