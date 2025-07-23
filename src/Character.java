import java.util.ArrayList;

public abstract class Character {
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String isAlive() {
        if (hp <= 0) {
            return "戦闘不能";
        } else {
            return "生存";
        }
    }


    void showStatus() {
        int Hp = Math.max(hp, 0);
        System.out.println(name + ":HP" + Hp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = hp;
        }
    }

    public abstract void attack(Monster mon);
}