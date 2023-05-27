import java.util.ArrayList;
import java.util.Collections;

// to represent a water type
public class Water implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Water() {
        typeName = "Water";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Grass(), new Electric());
        Collections.addAll(resistances, new Water(), new Steel(), new Fire(), new Ice());
    }

    // constructor with a given attacking type
    public Water(Type attacker) {
        typeName = "Water";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Grass(), new Electric());
        Collections.addAll(resistances, new Water(), new Steel(), new Fire(), new Ice());
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