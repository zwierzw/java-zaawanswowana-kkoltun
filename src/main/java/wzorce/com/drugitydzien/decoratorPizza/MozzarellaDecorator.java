package wzorce.com.drugitydzien.decoratorPizza;

public class MozzarellaDecorator extends BasicPizzaDecorator{

    private int mozzarellaPrice = 5;
    public MozzarellaDecorator(IPizza basicPizza) {
    super(basicPizza);
    }

    @Override
    public int getPrice() {
        System.out.println("+ cena za mozzarellę: " + mozzarellaPrice);
        return super.getPrice() + mozzarellaPrice;
    }
}
