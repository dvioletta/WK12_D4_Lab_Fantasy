package Characters;

import Items.HealersTools;

public class Healer_Type extends Character_Type{

    public String type;
    public HealersTools healingTools;


    public Healer_Type(String name, int HP, String type,  HealersTools healingTools){
        super(name, HP);
        this.type = type;
        this.healingTools = new HealersTools(healingTools.getHealingToolName(), healingTools.getDamage());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHealingToolName(HealersTools healingTool){

        return healingTool.getHealingToolName();
    }

    public void changeHealingName(HealersTools newhealingTools){
        this.healingTools = newhealingTools;
    }

//    public int attack() {
//        return this.getHealingToolDamage(this.healingTools);
//    }
}
