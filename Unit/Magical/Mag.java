package Unit.Magical;


public class Mag extends magical  {



    public Mag(int hp, int maxHp, int minAttack, int maxAttack,int def,int speed,int mana, int maxMana,String name,int x,int y) {
        super(hp,maxHp,minAttack,maxAttack,def,speed,x,y,mana, maxMana,name);
        super.name = name;
    }
    
    public Mag(String name,int x,int  y){
        this(75,75,18,20,5,15,150,150,name,x,y);
        

    }
    
    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d Урон: %d Защита: %d %2d Скорость %2d Маг",
        this.name, this.hp, this.maxHp, this.minAttack,this.maxAttack, this.def, this.speed, this.mana, this.maxMana, this.getClass().getSimpleName());
    }

   
    
}