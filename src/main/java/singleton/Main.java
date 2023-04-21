package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        a.setData(123);

        Singleton b = Singleton.getInstance();
        System.out.println(b.getData());
    }
}
