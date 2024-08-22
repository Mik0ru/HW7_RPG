public class Medic extends Hero{
    private double HealPoints = 20;
    public double getHealPoints(){
        return HealPoints;
    }
    public void increaseExperience(){
        HealPoints *= 1.1;
    }


    @Override
    public void applySuperAbility(){
        System.out.println("Medic" + " used his ability " + getSuperAbilityType());
    }
}
