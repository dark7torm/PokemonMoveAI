// to represent the bug type

import java.util.ArrayList;
import java.util.Collections;

// to represent the bug type
public class Bug implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor with no given type
    public Bug() {
        typeName = "Bug";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fire(), new Flying(), new Rock());
        Collections.addAll(resistances, new Grass(), new Fighting(), new Ground());
        attackingType = null;
    }

    // constructor with a given attack type
    public Bug(Type attacker) {
        typeName = "Bug";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fire(), new Flying(), new Rock());
        Collections.addAll(resistances, new Grass(), new Fighting(), new Ground());
        attackingType = attacker;
    }
    
    // getter for weaknesses
    public ArrayList<Type> getWeaknesses() {
        return weaknesses;
    }

    // getter for immunities
    public ArrayList<Type> getImmunities() {
        return immunities;
    }
    
    // getter for resistances
    public ArrayList<Type> getResistances() {
        return resistances;
    }

    // getter for typeName
    public String getName() {
        return typeName;
    }

    // getter for attackingMove
    public Type getAttackingType() {
        return attackingType;
    }

  
    
}