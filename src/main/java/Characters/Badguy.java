package Characters;

import Items.Weapon;

public
class Badguy extends Character_Type {

    public String type;
    protected Weapon weapon;

    public Badguy(String name, int HP, String type, Weapon weapon) {
        super(name, HP);
        this.type = type;
        this.weapon = weapon;
    }

    public
    String getType() {
        return type;
    }

    public
    void setType(String type) {
        this.type = type;
    }

    public
    Weapon getWeapon() {
        return weapon;
    }

    public
    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
