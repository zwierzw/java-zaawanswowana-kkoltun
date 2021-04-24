package wzorce.com.drugitydzien.decoratorPizza;

public class PizzaApp {
    public static void main(String[] args) {
        IPizza pizza = new SzynkaDecorator(new MozzarellaDecorator(new Pizza()));
        System.out.println(pizza.getPrice());
    }
}
