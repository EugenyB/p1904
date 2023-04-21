package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .corn(15)
                .cheese(20)
                .meat(10)
                .build();
        System.out.println(pizza);

    }
}
