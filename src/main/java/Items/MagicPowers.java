package Items;

public class MagicPowers {

    public String powerName;
    public int damage;

    public MagicPowers(String powerName, int damage){
        this.powerName = powerName;
        this.damage = damage;
    }

    public
    String getPowerName() {
        return powerName;
    }

    public
    void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public
    int getDamage() {
        return damage;
    }

    public
    void setDamage(int damage) {
        this.damage = damage;
    }
}
