public class Wizard extends Character {
    int mp;

    public Wizard(String name,int hp,int mp) {
        super(name,hp);
        this.name = name;
    }

    public void attack(Monster target) {
        System.out.println(name + "は火の玉を放った!" + target.name + "に3のダメージを与えた!");
        target.hp -= 3;
        mp -= 1;
    }
}
