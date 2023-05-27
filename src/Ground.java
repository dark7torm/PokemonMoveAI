import java.util.ArrayList;
import java.util.Collections;

// to reprersent a ground type
public class Ground implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Ground() {
        typeName = "Ground";
        Collections.addAll(weaknesses, new Grass(), new Water(), new Ice());
        Collections.addAll(immunities, new Electric());
        Collections.addAll(resistances, new Poison(), new Rock());
    }

    // constructor with a given attacking type
    public Ground(Type attacker) {
        typeName = "Ground";
        Collections.addAll(weaknesses, new Grass(), new Water(), new Ice());
        Collections.addAll(immunities, new Electric());
        Collections.addAll(resistances, new Poison(), new Rock());
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