package state;

public interface Direction {

    Direction UP = head -> new SnakeElement(head.x(), head.y() - 1);
    Direction DOWN = head -> new SnakeElement(head.x(), head.y() + 1);
    Direction LEFT = head -> new SnakeElement(head.x() - 1, head.y());
    Direction RIGHT = head -> new SnakeElement(head.x() + 1, head.y());

    SnakeElement next(SnakeElement head);
}
