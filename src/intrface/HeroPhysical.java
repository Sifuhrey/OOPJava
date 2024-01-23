package intrface;

public class HeroPhysical extends Hero implements Attack {

    HeroPhysical(String name, int HP, int MagicalDEF, int PhysicalDEF, int ATK) {
        super(name, HP, MagicalDEF, PhysicalDEF, ATK);
        this.type = "Physical";

    }

    @Override
    public boolean isLife() {
        return (this.HP >= 0);
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println(this.name + " attack " + enemy.name + " with " + this.ATK + " " + this.type + " Damage");
        enemy.Pdefence(this.ATK);

    }

}
