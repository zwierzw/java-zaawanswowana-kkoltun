package wzorce.com.drugitydzien.decoratorPizza;

public class BasicPizzaDecorator implements IPizza {

    private IPizza basicPizza;

    public BasicPizzaDecorator(IPizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public int getPrice() {
        return this.basicPizza.getPrice();
    }
}
