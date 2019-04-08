package Characters;

import Interfaces.IFlight;
import Items.Weapon;

public
class Badguy extends Character_Type implements IFlight {

    protected Weapon weapon;

    public Badguy(String name, int HP,Weapon weapon) {
        super(name, HP);
        this.weapon = new Weapon(weapon.getType(), weapon.getDamage());;
    }

    public String getWeapon(Weapon weapon){
        return weapon.getType();
    }

    public int getWeaponDamage(Weapon weapon) {
        return weapon.getDamage();
    }

    public Weapon changeWeapon(Weapon weapon){
        weapon = new Weapon(weapon.getType(), weapon.getDamage());
        return weapon;
    }


    public void fight(Character_Type warrior_type, int HP) {
        warrior_type.takedamage(this.getWeaponDamage(this.weapon));

    }

    public void takedamage(int damage){
        this.HP -=damage;
    }
}
