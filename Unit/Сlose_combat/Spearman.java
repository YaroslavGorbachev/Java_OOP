package Unit.Сlose_combat;

import java.util.ArrayList;

public class Spearman extends Character {
    
    

    public Spearman(int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int x,int y) {
        super(hp,maxHp,minAttack,maxAttack,def,speed,x,y);
        super.name = name;

 
    }
    public Spearman (String string,int x,int y){
        super(200,200,15,20,40,15,x,y);
        super.name= name;
}

 
    
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Копейщик",
        this.name, this.hp,this.maxHp,this.minAttack,maxAttack, this.def, this.speed,this.getClass().getSimpleName());
    }
    @Override
    public void step(ArrayList t1, ArrayList t2) {

    }
}