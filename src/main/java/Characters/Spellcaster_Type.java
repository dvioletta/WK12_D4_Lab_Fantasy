package Characters;

import Items.MagicPowers;

public
class Spellcaster_Type extends Character_Type{

    public String type;

    public Spellcaster_Type(String name, int HP, String type, MagicPowers spell) {
        super(name, HP);
        this.type = type;
        spell = new MagicPowers(spell.getPowerName(), spell.getDamage());
    }

    public
    String getType() {
        return type;
    }

    public
    void setType(String type) {
        this.type = type;
    }

    public String getPowerName(MagicPowers spell){
        return spell.getPowerName();
    }

    public MagicPowers changeMagicPowers(MagicPowers spell){
        spell = new MagicPowers(spell.getPowerName(), spell.getDamage());
        return spell;
    }

    public String attack() {
        return "attacked";
    }
}
