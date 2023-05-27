import java.util.ArrayList;
import java.util.Collections;

// to represent a poison type
public class Poison implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;
    
    // constructor
    public Poison() {
        typeName = "Poison";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Ground(), new Psychic());
        Collections.addAll(resistances, new Grass(), new Fighting(), new Poison(), new Bug());
    }

    // constructor with a given attacking type
    public Poison(Type attacker) {
        typeName = "Poison";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Ground(), new Psychic());
        Collections.addAll(resistances, new Grass(), new Fighting(), new Poison(), new Bug());
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