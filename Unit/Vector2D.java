package Unit;

public class Vector2D{


    protected int x;
    protected int y;
    
    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected static int distance(man u1, man u2){
        return (int) Math.sqrt((u1.pos.x - u2.pos.x)^2 + (u1.pos.y - u2.pos.y)^2);
      };

//    public double getDistance(man u1, man u2) {
//        return (int) Math.sqrt((u1.vector2d.x - u2.vector2d.x)^2 + (u1.vector2d.y - u2.vector2d.y)^2);
//    };

//    protected void getDistance(Vector2D vector2d) {
//       re ;
//    }


}
