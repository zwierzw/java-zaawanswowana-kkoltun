package wzorce.com.drugitydzien.decoratorPizza;

public class Pizza implements IPizza{
    private int price = 10;

    @Override
    public int getPrice() {
        System.out.println("+ cena za ciasto: " + price);
        return price;
    }
}
