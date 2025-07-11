public class Goblin extends Monster{
    public Goblin(String name, int hp, char suffix) {
        super(name, hp, suffix);
        this.name = name;
    }

    void attack(Character target) {
        System.out.println(name + suffix + "はナイフで切りつけた!" + target.name + "に8のダメージを与えた!");
        target.hp -= 8;
    }
}
