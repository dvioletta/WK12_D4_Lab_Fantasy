package Rooms;

import Characters.Badguy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public
class Fighting_Room {

    protected Badguy badguy;
    protected static Random random;
    private Set<Integer> badguyFound = new HashSet<Integer>();
    private final int NUM_badguy = 4;



    public Fighting_Room(Badguy badguy){
        this.badguy = new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());


    }


    public String getBadguy() {
        return badguy.getType();
    }

    public Badguy newRandomInstance() {
        if (badguyFound.size() == NUM_badguy) {
            badguyFound.clear();
        }
        int i;{
            i = random.nextInt(NUM_badguy);
        } while (badguyFound.contains(i));
        badguyFound.add(i);
        if (i==0){
            return new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());
        } else if (i==1){
            return new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());
        } else if (i==2){
            return new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());
        }else if (i==3){
            return new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());
        }
        else {
            return new Badguy(badguy.getName(), badguy.getHP(), badguy.getType(), badguy.getWeapon());
        }



    }
}

