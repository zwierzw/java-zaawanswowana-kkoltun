package wzorce.com.drugitydzien.decoratorBlzazej;

public class PoliceCarDecorator extends BasicCarDecorator {

    public PoliceCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check police car system");
    }
}
