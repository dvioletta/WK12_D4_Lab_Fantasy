package Characters;

import Characters.Weapon;

public class Warrior_Type extends Character_Type implements IFight{

    public String type;

    public Warrior_Type(String name, Integer HP, String type, Weapon weapon) {
        super(name, HP);
        this.type = type;
        weapon = new Weapon(weapon.getType(), weapon.getDamage());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public

}
