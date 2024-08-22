import java.util.Random;
public class Main {
    public static void main(String[] args) {
        AbilitiesType[] abilities = AbilitiesType.values();
        Hero[] heroes = {new Medic(),new Magic(), new Warrior()};

        for (Hero hero : heroes) {
            Random random = new Random();
            hero.setHeroHealth(random.nextInt(100)+150);
            hero.setHeroDamage(random.nextInt(30)+20);
            hero.setSuperAbilityType(abilities[random.nextInt(0, abilities.length)].toString());
            hero.applySuperAbility();
            if (hero instanceof Medic ) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic's increases his heal points to " + medic.getHealPoints() );

            }

        }


    }
}