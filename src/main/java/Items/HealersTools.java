package Items;

public
class HealersTools {

    public String healingToolName;
    public int damage;

    public
    HealersTools(String healingToolName, int damage){
        this.healingToolName = healingToolName;
        this.damage = damage;
    }

    public
    String getHealingToolName() {
        return healingToolName;
    }

    public
    void setHealingToolName(String healingToolName) {
        this.healingToolName = healingToolName;
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
