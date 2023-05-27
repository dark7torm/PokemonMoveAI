import java.util.ArrayList;
import java.util.Collections;

// to represent a fire type
public class Fire implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;
    
    // constructor
    public Fire() {
        typeName = "Fire";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Water(), new Ground(), new Rock());
        Collections.addAll(resistances, new Fire(), new Water(), new Ice(), new Bug(), new Steel(), new Fairy());
    }

    // constructor with a given attacker type
    public Fire(Type attacker) {
        typeName = "Fire";
        immunities = new ArrayList<Type>();
        Collections.addAll(weaknesses, new Water(), new Ground(), new Rock());
        Collections.addAll(resistances, new Fire(), new Water(), new Ice(), new Bug(), new Steel(), new Fairy());
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