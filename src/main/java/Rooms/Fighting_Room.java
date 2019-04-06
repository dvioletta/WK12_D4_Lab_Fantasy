package Rooms;

import Characters.Badguy;

public
class Fighting_Room {

    public Badguy badguy;

    public Fighting_Room(Badguy badguy){
        this.badguy = new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());
    }

    public String getBadguy() {
        return badguy.getType();
    }
}
