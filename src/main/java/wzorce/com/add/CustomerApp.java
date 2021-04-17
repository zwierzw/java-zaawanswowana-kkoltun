package wzorce.com.add;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerApp {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", 7));
        customers.add(new Customer("John", 7));
        customers.add(new Customer("Arnold", 77));
        customers.add(new Customer("Zbigniew", 22));
        customers.add(new Customer("Adam", 88));


        System.out.println(customers);
        customers = customers.stream()
                .distinct() //usuwa duplikaty, wymaga nadpisywania metody equals/hashcode
                .collect(Collectors.toList());

        System.out.println(customers);


        List<Customer> customerMoreThan100points = customers.stream()
                .filter(customer -> customer.getPoint()>100)
                .collect(Collectors.toList());
        System.out.println(customerMoreThan100points);

    }
}
