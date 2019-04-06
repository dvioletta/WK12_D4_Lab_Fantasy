package Rooms;

import Items.HealersTools;
import Items.Loot;
import Items.MagicPowers;
import Items.Weapon;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public
class Collection_Room {

    protected Loot loot;
    protected static Random random;
    private static Set<Integer> lootFound = new HashSet<Integer>();
    private final static int NUM_Loot = 2;

    static {
        random = new Random();
    }

    public Collection_Room(Loot loot) {
        this.loot = new Loot(loot.getType(),loot.getPoints());

    }

    public static Loot newRandomInstance(){
        if(lootFound.size() == NUM_Loot){
            lootFound.clear();
        }
        int i;
        do{
            i = random.nextInt(NUM_Loot);
        } while(lootFound.contains(i));
        lootFound.add(i);

        if (i==0){
            return new Loot("Gold", 10);
        } else if (i==1){
            return new Loot("Gem", 15);
        } else {
            return new Loot("Silver", 5);
        }
    }

    public String getItem(){
        return "You have received " + loot.points;
    }
}
