package Unit;

public class Vector2D {


    protected int x;
    protected int y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected int distance(Human u1, Human u2) {
        return (int) Math.sqrt((u1.pos.x - u2.pos.x) ^ 2 + (u1.pos.y - u2.pos.y) ^ 2);
    }

    protected boolean onTheLeft(Vector2D pos) {
        return (x < pos.x) ? false : true;
    }

    protected boolean onTheTop(Vector2D pos) {
        return (y > pos.y) ? false : true;
    }

    public double distance(Vector2D pos) {

        return 0;
    }

}



