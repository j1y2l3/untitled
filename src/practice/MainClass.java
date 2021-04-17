package practice;

public class MainClass {
    public static void main(String args[]){
        TV haierTV =new TV();
        haierTV.setChannel(5);
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        Family zhangsanFamily=new Family();
        zhangsanFamily.buyTV(haierTV);
        System.out.println("zhangsanFamily开始看电视节目");
        zhangsanFamily.seeTV();
        int m=2;
        System.out.println("zhangsanFamily将电视更换到"+"频道");
        zhangsanFamily.remoteControl(m);
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        System.out.println("zhangsanFamily在看电视");
        zhangsanFamily.seeTV();
        Family lisiFamily = new Family();//lisi家的电视接上了电视台总台，可以观看可播放频道的电视了！！！
        lisiFamily.buyTV(haierTV);//lisi家获得了haierTV的频道的观看权限，可观看haierTV的频道
        lisiFamily.seeTV();//lisi观看了haierTV频道的电视，执行TV.java里的函数showprogram，播放haierTV的频道
    }
}
