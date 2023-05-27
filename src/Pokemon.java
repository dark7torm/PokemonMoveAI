

import java.util.ArrayList;
// to represent a pokemon
public class Pokemon {
    private Type type1;
    private Type type2;
    private int health;
    private int attack;
    private int defense;
    private int specialDefense;
    private int speed;
    private int specialAttack;
    private Ability ability;
    private Type incomingMoveType;


    // constructor
    public Pokemon(Type t1, Type t2, Ability a, Type m, int hp, int atk, int def, int spD, int sp, int spA) {
        type1 = t1;
        type2 = t2;
        ability = a;
        incomingMoveType = m;
        health = hp;
        attack = atk;
        defense = def;
        specialDefense = spD;
        speed = sp;
        specialAttack = spA;
    }

    // getter for the first type
    public Type getTypeOne() {
        return type1;
    }

    // getter for the second type
    public Type getTypeTwo() {
        return type2;
    }

    // getter for the ability type
    public Ability getAbility() {
        return ability;
    }

      // returns the multiplier value for the typing
      public double effectiveMultiplier() {
        ArrayList<Type> effective1 = type1.getWeaknesses();
        ArrayList<Type> resisted1 = type1.getResistances();
        ArrayList<Type> immune1 = type1.getImmunities();
        ArrayList<Type> effective2 = type2.getWeaknesses();
        ArrayList<Type> resisted2 = type2.getResistances();
        ArrayList<Type> immune2 = type2.getImmunities();
        double finalValue = 1.0;
        if(immune1.contains(incomingMoveType) || immune2.contains(incomingMoveType)) {
            return 0;
        }
        if(effective1.contains(incomingMoveType)) {
            finalValue = finalValue * 2;
        }
        if(effective2.contains(incomingMoveType)) {
            finalValue = finalValue * 2;
        }
        if(resisted1.contains(incomingMoveType)) {
            finalValue = finalValue * 0.5;
        }
        if(resisted2.contains(incomingMoveType)) {
            finalValue = finalValue * 0.5;
        }
        return finalValue;

        

      }
  



}
