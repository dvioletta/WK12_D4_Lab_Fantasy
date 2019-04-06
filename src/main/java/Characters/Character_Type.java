package Characters;

import Interfaces.IDefend;
import Interfaces.IFight;

public abstract class Character_Type {
//        implements IFight, IDefend {

    protected String name;
    protected int HP;

    public Character_Type(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    int getHP() {
        return HP;
    }

    public
    void setHP(int HP) {
        this.HP = HP;
    }

    public void reduceHP(int damage) {
        this.HP -= damage;
    }
}
