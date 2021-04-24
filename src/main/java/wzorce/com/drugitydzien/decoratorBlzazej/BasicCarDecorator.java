package wzorce.com.drugitydzien.decoratorBlzazej;

public class BasicCarDecorator implements ICar{

    private ICar basicCar;

    public BasicCarDecorator(ICar basicCar) {
        this.basicCar = basicCar;
    }

    @Override
    public void startEngine() {
        //możemy już tu coś zmienić
        this.basicCar.startEngine();
    }
}
