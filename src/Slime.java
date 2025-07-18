public class Slime extends Monster{
    public Slime(String name, int hp, char suffix) {
        super(name, hp, suffix);
        this.name = name;
    }

    public void attack(Character target) {
        System.out.println(name + suffix + "は体当たり攻撃!" + target.name + "に5のダメージを与えた!");
        target.hp -= 5;
    }
}
