package Interface;

public class IndiaTraffic implements CentralTraffic,ContinentalTraffic{

    public static void main(String[] args) {
        CentralTraffic traffic = new IndiaTraffic();
        traffic.red();
        traffic.green();
        traffic.yellow();
        ((IndiaTraffic)(traffic)).walk();
        ContinentalTraffic continentalTraffic = new IndiaTraffic();
        continentalTraffic.trainSymbol();
    }

    @Override
    public void green() {
        System.out.println("Gooo......");
    }

    @Override
    public void red() {
        System.out.println("Stop......");

    }

    @Override
    public void yellow() {
        System.out.println("wait........");
    }

    public void walk(){
        System.out.println("walk.........");
    }

    @Override
    public void trainSymbol() {
        System.out.println("train symbol........");
    }
}
