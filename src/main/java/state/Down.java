package state;

public class Down implements Direction {
    @Override
    public SnakeElement next(SnakeElement head) {
        return new SnakeElement(head.x(), head.y() + 1);
    }
}
