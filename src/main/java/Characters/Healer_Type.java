package Characters;

import Characters.Health;

public class Healer_Type extends Character_Type implements IFight {

    public String type;


    public Healer_Type(String name, int HP, String type,  Health healingTool){
        super(name, HP);
        this.type = type;
        healingTool = new Health(healingTool.getHealingToolName(), healingTool.getDamage());

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHealingToolName(Health healingTool){

        return healingTool.getHealingToolName();
    }

    public Health changeHealingName(Health healingTool){
        healingTool = new Health(healingTool.getHealingToolName(), healingTool.getDamage());
        return healingTool;
    }
}
