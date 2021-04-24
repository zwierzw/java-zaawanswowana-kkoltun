package wzorce.com.drugitydzien.decoratorBlzazej;

public class App {
    public static void main(String[] args) {
//        ICar car = new Car();
////        car.startEngine();
//
//
//        ICar carDecorator = new BasicCarDecorator(car);
//        carDecorator.startEngine();

        ICar car = new LuxuryCarDecorator(new PoliceCarDecorator(new Car()));
        car.startEngine();
    }
}
