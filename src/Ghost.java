import java.util.ArrayList;
import java.util.Collections;

// to represent a ghost type
public class Ghost implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Ghost() {
        typeName = "Ghost";
        Collections.addAll(weaknesses, new Ghost(), new Dark());
        Collections.addAll(immunities, new Normal(), new Fighting());
        Collections.addAll(resistances, new Poison(), new Bug());
    }

    // constructor with an attacking type
    public Ghost(Type attacker) {
        typeName = "Ghost";
        Collections.addAll(weaknesses, new Ghost(), new Dark());
        Collections.addAll(immunities, new Normal(), new Fighting());
        Collections.addAll(resistances, new Poison(), new Bug());
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