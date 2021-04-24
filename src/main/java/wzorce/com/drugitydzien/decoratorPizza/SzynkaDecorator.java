package wzorce.com.drugitydzien.decoratorPizza;

public class SzynkaDecorator extends BasicPizzaDecorator{

    private int szynkaPrice = 7;
    public SzynkaDecorator(IPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public int getPrice() {
        System.out.println("+ cena za szynkę: " + szynkaPrice);
        return super.getPrice() + szynkaPrice;
    }
}
