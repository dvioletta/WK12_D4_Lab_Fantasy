package Characters;


import Interfaces.IDefend;
import Interfaces.IFlight;
import Items.Weapon;

public class Warrior_Type extends Character_Type implements IFlight {

    public String type;
    public Weapon weapon;

    public Warrior_Type(String name, Integer HP, String type, Weapon weapon) {
        super(name, HP);
        this.type = type;
        this.weapon = new Weapon(weapon.getType(), weapon.getDamage());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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


    public int attack() {

        return this.getWeaponDamage(this.weapon);
    }

    public void fight(Character_Type badguy, int HP) {
        badguy.takedamage(this.getWeaponDamage(this.weapon));

    }

    public void takedamage(int damage){
        this.HP -=damage;
    }


}
