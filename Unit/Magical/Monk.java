package Unit.Magical;
public class Monk extends magical{



    public Monk(int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int mana, int maxMana, String name,int x,int y) {
        super(hp,maxHp,minAttack,maxAttack,def,speed,x,y,mana, maxMana,name);
        super.name = name;
    }
    public Monk(String name,int x,int  y){
        super(75,75,-20,-20,5,10,150,150,y,x,name);
    }
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Монах",
        this.name, this.hp, this.maxHp, this.minAttack,this.maxAttack, this.def, this.speed, this.mana, this.maxMana, this.getClass().getSimpleName());
    }


}