package Unit;

import java.util.ArrayList;

public interface GameInterface {

    default void step(ArrayList<man> t1, ArrayList<man> t2) {
    }

    String getInfo();
   
}
