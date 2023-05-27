import java.util.ArrayList;
import java.util.Collections;

// to represent the dark type
public class Dark implements Type {
    private ArrayList<Type> weaknesses;
    private ArrayList<Type> immunities;
    private ArrayList<Type> resistances;
    private String typeName;
    private Type attackingType;

    //constructor
    public Dark() {
        typeName = "Dark";
        Collections.addAll(weaknesses, new Fighting(), new Bug(), new Fairy());
        Collections.addAll(immunities, new Psychic());
        Collections.addAll(resistances, new Ghost(), new Dark());
        attackingType = null;
    }

    //constructor with no given type
    public Dark(Type attacker) {
        typeName = "Dark";
        Collections.addAll(weaknesses, new Fighting(), new Bug(), new Fairy());
        Collections.addAll(immunities, new Psychic());
        Collections.addAll(resistances, new Ghost(), new Dark());
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