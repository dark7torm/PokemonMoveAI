import java.util.ArrayList;
import java.util.Collections;

// to represent a psychic type
public class Psychic implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;
    
    //constructor 
    public Psychic() {
        typeName = "Psychic";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Dark(), new Ghost(), new Bug());
        Collections.addAll(resistances, new Fighting(), new Psychic());
    }
    
    //constructor with a given attacking type
    public Psychic(Type attacker) {
        typeName = "Psychic";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Dark(), new Ghost(), new Bug());
        Collections.addAll(resistances, new Fighting(), new Psychic());
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