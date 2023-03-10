package Unit;

import java.util.ArrayList;

public interface GameInterface {

    default void step(ArrayList<Human> t1, ArrayList<Human> t2) {
    }

    String getInfo();
   
}
