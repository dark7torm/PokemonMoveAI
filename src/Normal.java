import java.util.ArrayList;
import java.util.Collections;

// to represent a normal type
public class Normal implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Normal() {
        typeName = "Normal";
        resistances = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fighting());
        Collections.addAll(immunities, new Ghost());
    }

    // constructor with a given attacking type
    public Normal(Type attacker) {
        typeName = "Normal";
        resistances = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fighting());
        Collections.addAll(immunities, new Ghost());
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