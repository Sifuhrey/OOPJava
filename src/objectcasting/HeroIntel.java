package objectcasting;

public class HeroIntel extends Hero {
    HeroIntel(String name, int HP){
        super(name, HP);
        this.type = "Intel";
    }
}
