package practice;

public class User {
    public static void main(String args[]){
        Vehicle car1,car2;
        car1 = new Vehicle();
        car2 = new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1的功率是："+car1.getPower());
        System.out.println("car2的功率是："+car2.getPower());
        car1.speedUp(666);
        car2.speedUp(80);//按书上代码应该输入80，按图片应该输入100
        System.out.println("car1目前的速度："+car1.getSpeed());//0+666本该为666，改进后则为200
        System.out.println("car2目前的速度："+car2.getSpeed());
        car1.brake();
        car2.speedDown(20);
        System.out.println("car1目前的速度："+car1.getSpeed());//速度清0
        System.out.println("car2目前的速度："+car2.getSpeed());
        car1.speedDown(888);
        System.out.println("car1目前的速度是："+car1.getSpeed());//0-888本该为-888，改进后则为0
    }
}
