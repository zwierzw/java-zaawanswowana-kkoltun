package wzorce.com.drugitydzien.decoratorBlzazej;

public class LuxuryCarDecorator extends BasicCarDecorator{


    public LuxuryCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine(); //wywołuję funkcjonalność BasicCarDecoratora
        System.out.println("Check airCondition"); //dodaję mój dodatek
    }
}
