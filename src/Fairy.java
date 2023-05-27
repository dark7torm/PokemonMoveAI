import java.util.ArrayList;
import java.util.Collections;

// to represent a fairy type
public class Fairy implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;
    
    // constructor
    public Fairy() {
        typeName = "Fairy";
        weaknesses = new ArrayList<Type>();
        immunities = new ArrayList<Type>();
        resistances = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Poison(), new Steel());
        Collections.addAll(immunities, new Dragon());
        Collections.addAll(resistances, new Fighting(), new Bug(), new Dark());
    }

    // constructor with given type
    public Fairy(Type attacker) {
        typeName = "Fairy";
        Collections.addAll(weaknesses, new Poison(), new Steel());
        Collections.addAll(immunities, new Dragon());
        Collections.addAll(resistances, new Fighting(), new Bug(), new Dark());
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