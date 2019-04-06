package Rooms;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public
class Monster {

    protected String name;
    protected String type;
    protected int HP;
    private static Random random = new Random();
    private static Set<Integer> monsterFound = new HashSet<Integer>();
    private static int NUM_Monsters = 4;

    public Monster(String name, String type, int HP){
        this.name = name;
        this.type = type;
        this.HP = HP;
    }

    public static Monster newRandomInstance(){
        if(monsterFound.size() == NUM_Monsters){
            monsterFound.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_Monsters);
        }while (monsterFound.contains(i));
        monsterFound.add(i);
        if (i==0){
            return new Monster("Harriet","Harpy",20);
        } else if (i==1){
            return new Monster("ThornBe","Troll",25);
        } else if(i==2){
            return new Monster("Tailor","Dragon",50);
        } else if (i==3){
            return new Monster("Voldermont","Goblin",30);
        } else{
            return new Monster("Skrull","Skelton",5);
        }
    }

    public String getName(){
        return "You have encountered this.name";
    }

}
