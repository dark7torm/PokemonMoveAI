import java.util.ArrayList;
import java.util.Collections;

// to represent a steel type
public class Steel implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Steel() {
        typeName = "Steel";
        Collections.addAll(weaknesses, new Fighting(), new Ground(), new Fire());
        Collections.addAll(immunities, new Poison());
        Collections.addAll(resistances, new Normal(), new Grass(), new Ice(), 
        new Flying(), new Rock(), new Bug(), new Dragon(), new Psychic(), new Steel());
    }

    // constructor with a given attacking type
    public Steel(Type attacker) {
        typeName = "Steel";
        Collections.addAll(weaknesses, new Fighting(), new Ground(), new Fire());
        Collections.addAll(immunities, new Poison());
        Collections.addAll(resistances, new Normal(), new Grass(), new Ice(), 
        new Flying(), new Rock(), new Bug(), new Dragon(), new Psychic(), new Steel());
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