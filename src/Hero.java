public class Hero extends Character {
    String weapon;

    public Hero(String name,int hp,String weapon){
        super(name,hp);
        this.name = name;
    }

    void attack(Character target) {
        System.out.println(name + "は" + weapon + "で攻撃!" + target.name + "に10のダメージを与えた!");
        target.hp -= 10;
    }

    Hero hero = new Hero(name,hp,weapon);
    SuperHero superHero = new SuperHero(hero);

    public SuperHero getSuperHero() {
        return superHero;
    }

    public void setSuperHero(SuperHero superHero) {
        this.superHero = superHero;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
