// to represent an ability
public class Ability {
    private String abilityName;
    private String description;

    //constructor
    public Ability(String a, String d) {
        abilityName = a;
        description = d;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public String getDesc() {
        return description;
    }


}
