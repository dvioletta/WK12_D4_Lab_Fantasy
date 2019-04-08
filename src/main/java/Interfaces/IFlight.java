package Interfaces;

import Characters.Character_Type;

public
interface IFlight {

    public void fight(Character_Type character_type,  int HP);

    void takedamage(int damage);
}
