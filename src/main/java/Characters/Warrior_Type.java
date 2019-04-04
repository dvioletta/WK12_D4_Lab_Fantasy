package Characters;

public
class Warrior_Type extends Character_Type {

    public String type;
    public String weapon;

    public Warrior_Type(String name, Integer HP, String type, String weapon) {
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
    String getWeapon() {
        return weapon;
    }

    public
    void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
