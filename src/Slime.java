public class Slime extends Monster{
    public Slime(int hp, char suffix) {
        super("スライム", hp, suffix);
    }

    public void attack(Character target) {
        System.out.println(name + suffix + "は体当たり攻撃!" + target.name + "に5のダメージを与えた!");
        target.hp -= 5;
    }
}
