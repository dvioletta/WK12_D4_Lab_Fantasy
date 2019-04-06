package GameLogic;

import Characters.Warrior_Type;
import Interfaces.IDefend;
import Interfaces.IFight;

public
class GameLogic {

    public void fight(IFight attacker, IDefend defender){
        defender.reduceHP(attacker.attack());
    }
//    if IDefend > 0
//    return "You are dead"


}
