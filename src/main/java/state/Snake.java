package state;

public class Snake {
    Direction direction = Direction.UP;

    private SnakeElement head = new SnakeElement(10, 10);

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        head = direction.next(head);
    }
}
