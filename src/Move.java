// to represent a move
public class Move {
    private String moveName;
    private Type moveType;
    private Pokemon current;
    private boolean stab;
    private int basePower;
    private double power;
    private boolean isDamage;
    private boolean isStatus;


    public Move(int base, String name, boolean damage, Type moveT) {
        moveName = name;
        if(current.getTypeOne().equals(moveType) || current.getTypeTwo().equals(moveType)) {
            stab = true;
        } else stab = false;
        basePower = base;
        isDamage = damage;
        if(isDamage) {
            isStatus = false;
            power = basePower * current.effectiveMultiplier();
            if(stab) {
                if(current.getAbility().getAbilityName().equals("Adaptability")) {
                    power = power * 2;
                } else power = power * 1.5;
            }
        } else isStatus = true;
        moveType = moveT;
    }

    public String getMoveName() {
        return this.moveName;
    }

    public Type getMoveType() {
        return this.moveType;
    }

    public Pokemon getCurrent() {
        return this.current;
    }

    public boolean getStab() {
        return this.stab;
    }

    public int getBasePower() {
        return this.basePower;
    }

    public double getPower() {
        return this.power;
    }

    public boolean getIsDamage() {
        return this.isDamage;
    }

    public boolean getIsStatus() {
        return this.isStatus;
    }

    public boolean insertCanKill(int enemyHealth, int enemyDef, int enemySpD, Move usedMove, Pokemon current) {
        return false;
    }


}