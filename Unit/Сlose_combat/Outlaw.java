package Unit.Сlose_combat;


import java.util.ArrayList;


public class Outlaw extends Character {


   
    public Outlaw (int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int x,int y) {
        super(hp,maxHp,minAttack,maxAttack,def,speed,x,y);;
        this.stealth = stealth;
        super.name = name;
    }
    public Outlaw (String string,int x,int y){
            super(100,100,12,15,10,20,x,y);
            super.name= name;
    }
 
   
    
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Вор",
        this.name, this.hp,this.maxHp,this.minAttack,maxAttack, this.def, this.speed,this.getClass().getSimpleName());
    }
    
    @Override
    public void step(ArrayList t1, ArrayList t2) {

    }
}