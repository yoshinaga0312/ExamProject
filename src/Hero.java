public class Hero extends Character {
    String weapon="剣";

    public Hero(String name,int hp,String weapon){
        super(name,hp);
        this.name = name;
        this.weapon = weapon;
    }

    public void attack(Monster target) {
        System.out.println(name + "は" + weapon + "で攻撃!" + target.name + "に10のダメージを与えた!");
        target.hp -= 10;
    }


    /*public SuperHero getSuperHero() {
        return superHero;
    }

    public void setSuperHero(SuperHero superHero) {
        this.superHero = superHero;
    }*/

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
