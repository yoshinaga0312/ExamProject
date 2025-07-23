public abstract class Monster{
    String name;
    int hp;
    char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public String isAlive() {
        if (hp <= 0) {
            return "討伐済み";
        } else {
            return "生存";
        }
    }

    void showStatus(){
        int Hp = Math.max(hp, 0);
        System.out.println(name + suffix + ":HP" + Hp);
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
