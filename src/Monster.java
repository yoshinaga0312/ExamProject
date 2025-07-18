public abstract class Monster{
    String name;
    int hp;
    char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    final boolean isAlive(){
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    void showStatus(){
        System.out.println(name + suffix + ":HP" + hp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = hp;
        }
    }

    public abstract void attack(Character c);
}
