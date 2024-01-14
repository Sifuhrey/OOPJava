package medieval;

class Player{
    private String name;
    private int baseHP;
    private int baseATK;
    private int increaseHP;
    private int increaseATK;
    private int level;
    private int totalDMG;
    private boolean lifeStatus;

    // Ini adalah object member
    private Armor armor;
    private Weapon weapon;

    public Player(String name){
        this.name = name;
        this.baseHP = 100;
        this.baseATK = 100;
        this.level = 1;
        this.increaseHP = 20;
        this.increaseATK = 20;
        this.lifeStatus = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.maxHP() - this.totalDMG;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHP() +"/" + this.maxHP());
        System.out.println("Attack\t\t: " + this.getTotalATK());
        System.out.println("Alive\t\t: " + this.lifeStatus + "\n");
    }

    public void attack(Player opponent){
        // hitung damage
        int damage = this.getTotalATK();
        // print event
        System.out.println(this.name + " is attacking " + opponent.getName() + " with " + damage);
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int DMG){

        // receive damage
        int DEF = this.armor.getDEF();
        int deltaDMG;

        System.out.println(this.name + " defence power = "+ DEF);
        if(DMG > DEF){
            deltaDMG = DMG - DEF;
        } else {
            deltaDMG = 0;
        }
        
        System.out.println("damage earned = " + deltaDMG + "\n");
        
        // adding total damage
        this.totalDMG += deltaDMG;

        // check is alive
        if (this.getHP() <= 0){
            this.lifeStatus = false;
            this.totalDMG = this.maxHP();
        }

        this.display();
    }
    
    private int getTotalATK(){
        return this.baseATK + this.level*this.increaseATK + this.weapon.getATK();
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHP(){
        return this.baseHP + this.level*this.increaseHP + this.armor.getAddHP();
    }
}
