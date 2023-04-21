package adapter;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        long a = 1001;
        long b = 65;
        long gcd = SimpleMath.gcd(a, b);
    }
}
