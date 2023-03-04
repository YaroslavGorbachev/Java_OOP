package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class man implements GameInterface {

    public int hp;
    protected int maxHp;
    protected int minAttack;
    protected int maxAttack;
    protected int attack;
    protected int def;
    protected int speed;
    protected static String name;
//    static int prCount;
    protected Vector2D pos;
    public String state;

    public man(int hp, int maxHp, int minAttack, int maxAttack, int attack, int def, int x, int y) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.def = def;
        this.speed = speed;
        this.attack = attack;
        this.name = name;
//        prCount++;
        pos = new Vector2D(x, y);
        state = "stand";
    }
    @Override
    public String getInfo() {
        return "Я человек!";
    }
    public int getSpeed() {
        return speed;
    }
    public int getHp() {
        return hp;
    }

    public int findNearest(ArrayList<man> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > pos.distance(team.get(i).pos) & !team.get(i).state.equals("Die")) {
                index = i;
                min = pos.distance(team.get(i).pos);
            }
        }
        return index;
    }

    public static String getName() { // Дать случайное имя
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
    protected int treatmentNearest(ArrayList<man> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > team.get(i).hp) {
                index = i;
                min = team.get(i).hp;
            }
        }
        return index;
    }
    protected void getDamage(float damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0)
            System.out.println(getInfo() + " " + name + " умер");
            state = "Die";
            hp = 0;
    }
    public int[] getPos() {
        return new int[]{pos.x, pos.y};
    }
    public String getState() {
        return state;
    }
}



    


    
    




    
