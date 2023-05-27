import java.util.ArrayList;
import java.util.Collections;

// to represent a fighting type
public class Fighting implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Fighting() {
        typeName = "Fighting";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Flying(), new Psychic(), new Fairy());
        Collections.addAll(resistances, new Bug(), new Rock(), new Dark());
    }

    // constructor
    public Fighting(Type attacker) {
        typeName = "Fighting";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Flying(), new Psychic(), new Fairy());
        Collections.addAll(resistances, new Bug(), new Rock(), new Dark());
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