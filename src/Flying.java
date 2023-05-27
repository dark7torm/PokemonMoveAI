import java.util.ArrayList;
import java.util.Collections;

// to represent a flying type
public class Flying implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Flying() {
        typeName = "Flying";
        Collections.addAll(weaknesses, new Electric(), new Ice(), new Rock());
        Collections.addAll(immunities, new Ground());
        Collections.addAll(resistances, new Grass(), new Fighting(), new Bug());
    }

    // constructor with a given attacking type
    public Flying(Type attacker) {
        typeName = "Flying";
        Collections.addAll(weaknesses, new Electric(), new Ice(), new Rock());
        Collections.addAll(immunities, new Ground());
        Collections.addAll(resistances, new Grass(), new Fighting(), new Bug());
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