public abstract class Character{
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    final boolean isAlive(){
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    void showStatus(){
        System.out.println(name + ":HP" + hp);
    }

    public int getHp(){
        return this.hp;
    }
    public String setName() {
        return this.name;
    }
}