public class Matango extends Monster{
    public Matango(String name, int hp, char suffix) {
        super(name, hp, suffix);
        this.name = name;
    }

    void attack(Character target) {
        System.out.println(name + suffix + "は体当たり攻撃!" + target.name + "に6のダメージを与えた!");
        target.hp -= 6;
    }
}
