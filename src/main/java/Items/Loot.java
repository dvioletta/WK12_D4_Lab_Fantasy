package Items;

public
class Loot {

    public String type;
    public int points;

    public Loot(String type, int points){
        this.type = type;
        this.points = points;
    }

    public String getType() {
        return type;
    }

    public
    void setType(String type) {
        this.type = type;
    }

    public
    int getPoints() {
        return points;
    }

    public
    void setPoints(int points) {
        this.points = points;
    }


    public String toString(){
        return String.valueOf(points);
    }

    public String getItem(){
        return "You have received " + points;
    }
}
