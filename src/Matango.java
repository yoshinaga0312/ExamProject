public class Matango extends Monster{
    public Matango(int hp, char suffix) {
        super("お化けキノコ", hp, suffix);
    }

    public void attack(Character target) {
        System.out.println(name + suffix + "は体当たり攻撃!" + target.name + "に6のダメージを与えた!");
        target.hp -= 6;
    }
}
