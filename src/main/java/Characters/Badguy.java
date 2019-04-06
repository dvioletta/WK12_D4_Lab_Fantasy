package Characters;

import Items.Weapon;

public
class Badguy extends Character_Type {

    protected Weapon weapon;

    public Badguy(String name, int HP,Weapon weapon) {
        super(name, HP);
        this.weapon = weapon;
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
