import java.util.ArrayList;
import java.util.Collections;

// to represent the dragon type
public class Dragon implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Dragon() {
        typeName = "Dragon";
        Collections.addAll(weaknesses, new Fairy(), new Dragon(), new Ice());
        immunities = new ArrayList<Type>();
        Collections.addAll(resistances, new Fire(), new Water(), new Grass(), new Electric());
        attackingType = null;
    }

    // constructor with a given attacking type
    public Dragon(Type attacker) {
        typeName = "Dragon";
        Collections.addAll(weaknesses, new Fairy(), new Dragon(), new Ice());
        immunities = new ArrayList<Type>();
        Collections.addAll(resistances, new Fire(), new Water(), new Grass(), new Electric());
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