import java.util.ArrayList;

// to represent a type of pokemon
public interface Type {
    public ArrayList<Type> getWeaknesses();
    public ArrayList<Type> getImmunities();
    public ArrayList<Type> getResistances();
    public String getName();
    public Type getAttackingType();



    

    






}