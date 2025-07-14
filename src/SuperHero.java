public class SuperHero extends Hero{
    public SuperHero(Hero h) {
        super(h.name,h.hp,h.weapon);
    }

    void attack(Monster target) {
        System.out.println(name + "は" + weapon + "で攻撃!" + target.name + "に25のダメージを与えた!");
        target.hp -= 25;
    }
}
