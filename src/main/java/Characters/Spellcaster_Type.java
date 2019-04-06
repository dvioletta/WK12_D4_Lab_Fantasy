package Characters;

import Items.MagicPowers;

public
class Spellcaster_Type extends Character_Type{

    public MagicPowers magicPowers;
    protected String type;

    public Spellcaster_Type(String name, int HP, String type, MagicPowers magicPowers) {
        super(name, HP);
        this.type = type;
        this.magicPowers = new MagicPowers(magicPowers.getPowerName(), magicPowers.getDamage());
    }

    public
    String getType() {

        return type;
    }

    public
    void setType(String type) {

        this.type = type;
    }

    public String getPowerName(MagicPowers magicPowers){

        return magicPowers.getPowerName();
    }

    public int getMagicPowerDamage(MagicPowers magicPowers){
        return magicPowers.getDamage();
    }

    public MagicPowers changeMagicPowers(MagicPowers magicPowers){
        this.magicPowers = new MagicPowers(magicPowers.getPowerName(),magicPowers.getDamage());
        return magicPowers;
    }



}
