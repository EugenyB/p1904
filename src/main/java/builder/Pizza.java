package builder;

public class Pizza {
    private int cheese;

    private int meat;

    private int sausage;

    private int tomatoes;

    private int corn;

    private Pizza() {
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese=" + cheese +
                ", meat=" + meat +
                ", sausage=" + sausage +
                ", tomatoes=" + tomatoes +
                ", corn=" + corn +
                '}';
    }

    public static class Builder {
        private int cheese;

        private int meat;

        private int sausage;

        private int tomatoes;

        private int corn;

        public Builder cheese(int quantity) {
            cheese = quantity;
            return this;
        }

        public Builder meat(int quantity) {
            meat = quantity;
            return this;
        }

        public Builder sausage(int quantity) {
            sausage = quantity;
            return this;
        }

        public Builder tomatoes(int quantity) {
            tomatoes = quantity;
            return this;
        }

        public Builder corn(int quantity) {
            corn = quantity;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.meat = meat;
            pizza.tomatoes = tomatoes;
            pizza.cheese = cheese;
            pizza.corn = corn;
            pizza.sausage = sausage;

            return pizza;
        }

    }
}
