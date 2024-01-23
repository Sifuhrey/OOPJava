package intrface;

public class HeroMagic extends Hero implements Attack {

    protected int totemOfUndying;

    HeroMagic(String name, int HP, int MagicalDEF, int PhysicalDEF, int ATK) {
        super(name, HP, MagicalDEF, PhysicalDEF, ATK);
        this.type = "Magical";
        this.totemOfUndying = 6;
    }

    @Override
    public boolean isLife() {
        if (this.HP <= 0 && this.totemOfUndying > 0) {
            this.totemOfUndying--;
            this.HP = 100;
            return true;
        }
        return this.HP > 0;

    }

    @Override
    public void attack(Hero enemy) {
        System.out.println(
                "\n" + this.name + " attack " + enemy.name + " with " + this.ATK + " " + this.type + " Damage");
        enemy.Mdefence(this.ATK);
    }

}