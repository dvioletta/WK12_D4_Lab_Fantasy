package Characters;

import Characters.Weapon;

public class Warrior_Type extends Character_Type implements IFight{

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

    public int getWeaponDamagr(Weapon weapon) {
        return weapon.getDamage();
    }

    public Weapon changeWeapon(Weapon weapon){
        weapon = new Weapon(weapon.getType(), weapon.getDamage());
        return weapon;
    }


    public void attack(Character_Type badguy) {
        int damage = this.getWeaponDamagr(this.weapon);
        badguy.reduceHP(damage);
    }
}
