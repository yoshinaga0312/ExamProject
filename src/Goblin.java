public class Goblin extends Monster{
    public Goblin( int hp, char suffix) {
        super("ゴブリン", hp, suffix);
    }

    public void attack(Character target) {
        System.out.println(name + suffix + "はナイフで切りつけた!" + target.name + "に8のダメージを与えた!");
        target.hp -= 8;
    }
}
