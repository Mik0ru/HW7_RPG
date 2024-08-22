public abstract class Hero implements HavingSuperAbility {
    private int HeroDamage;
    private int HeroHealth;
    private String SuperAbilityType;

    public String getSuperAbilityType() {
        return SuperAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.SuperAbilityType = superAbilityType;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }
}
