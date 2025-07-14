public class Thief extends Character{
    public Thief(String name,int hp) {
        super(name,hp);
        this.name = name;
    }

    void attack(Monster target) {
        System.out.println(name + "素早く攻撃した!" + target.name + "に5のダメージを与えた!");
        target.hp -= 5;
    }
}
