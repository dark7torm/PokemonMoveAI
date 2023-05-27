import java.util.ArrayList;
import java.util.Collections;

// to represent a rock type
public class Rock implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Rock() {
        typeName = "Rock";
        weaknesses = new ArrayList<Type>();
        immunities = new ArrayList<Type>();
        resistances = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fighting(), new Water(), new Grass(), new Ground(), new Steel());
        Collections.addAll(resistances, new Normal(), new Fire(), new Poison(), new Flying());
    }

    // constructor with a given attacking type
    public Rock(Type attacker) {
        typeName = "Rock";
        weaknesses = new ArrayList<Type>();
        immunities = new ArrayList<Type>();
        resistances = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fighting(), new Water(), new Grass(), new Ground(), new Steel());
        Collections.addAll(resistances, new Normal(), new Fire(), new Poison(), new Flying());
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