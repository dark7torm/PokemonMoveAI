import java.util.ArrayList;
import java.util.Collections;

// to represent a grass type
public class Grass implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    // constructor
    public Grass() {
        typeName = "Grass";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fire(), new Flying(), new Ice(), new Poison(), new Bug());
        Collections.addAll(resistances, new Water(), new Grass(), new Electric(), new Ground());
    }

    // constructor with a given attacking type
    public Grass(Type attacker) {
        typeName = "Grass";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Fire(), new Flying(), new Ice(), new Poison(), new Bug());
        Collections.addAll(resistances, new Water(), new Grass(), new Electric(), new Ground());
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