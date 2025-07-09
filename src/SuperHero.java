public class SuperHero extends Hero{
    public SuperHero(){
        super(name,hp,weapon);
    }

    void attack(Character target) {
        System.out.println(name + "は" + weapon + "で攻撃!" + target.name + "に25のダメージを与えた!");
        target.hp -= 25;
    }
}
