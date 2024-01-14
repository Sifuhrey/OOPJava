package SubclassConstructor;

public class HeroStrength extends Hero{

    HeroStrength(String name, double DEF){
        super(name, DEF);
    }
    HeroStrength(String name){
        super(name);
    }
}
