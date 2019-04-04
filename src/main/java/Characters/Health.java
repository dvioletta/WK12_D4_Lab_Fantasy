package Characters;

public
class Health {

    public String healingToolName;
    public int damage;

    public Health(String healingToolName, int damage){
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
