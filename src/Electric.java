import java.util.ArrayList;
import java.util.Collections;

// to represent an Electric type
public class Electric implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;
    
    // constructor
    public Electric() {
        typeName = "Electric";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Ground());
        Collections.addAll(resistances, new Electric(), new Flying(), new Steel());
        attackingType = null;
    }
    // constructor with a given type
    public Electric(Type attacker) {
        typeName = "Electric";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Ground());
        Collections.addAll(resistances, new Electric(), new Flying(), new Steel());
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