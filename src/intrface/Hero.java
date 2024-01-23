package intrface;

public abstract class Hero {
    protected String type;
    protected String name;
    protected int HP;
    protected int MagicalDEF;
    protected int PhysicalDEF;
    protected boolean life;
    protected int ATK;

    public Hero(String name, int HP, int MagicalDEF, int PhysicalDEF, int ATK) {
        this.name = name;
        this.HP = HP;
        this.MagicalDEF = MagicalDEF;
        this.PhysicalDEF = PhysicalDEF;
        this.life = true;
        this.ATK = ATK;
    }

    public abstract boolean isLife();

    public void Mdefence(int DMG) {
        int DEF = this.MagicalDEF;
        System.out.println("\n" + this.name + " DEF : " + DEF);
        int realDMG = (DMG < DEF) ? 0 : DMG - DEF;
        System.out.println("Damage earned : " + realDMG);
        this.HP -= realDMG;
        this.isLife();
        if (this.life = false) {
            this.HP = 0;
        }
        this.display();
    }

    public void Pdefence(int DMG) {
        int DEF = this.PhysicalDEF;
        System.out.println("\n" + this.name + " DEF : " + DEF);
        int realDMG = (DMG < DEF) ? 0 : DMG - DEF;
        System.out.println("Damage earned : " + realDMG);
        this.HP -= realDMG;
        this.isLife();
        if (this.life == false) {
            this.HP = 0;
        }
        this.display();
    }

    public void display() {
        System.out.println("\nNama         : " + this.name);
        System.out.println("HP           : " + this.HP);
        System.out.println("Tipe         : " + this.type);
        System.out.println(this.type + " ATK : " + this.ATK);
        System.out.println("Magical DEF  : " + this.MagicalDEF);
        System.out.println("Physical DEF : " + this.PhysicalDEF);
        System.out.println("Status       : " + this.life);
    }
}
