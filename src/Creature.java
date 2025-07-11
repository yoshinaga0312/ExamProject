public interface Creature {
    void isAlive(boolean alive);
    void showStatus();
    void attack(Character target);
    void getName(String name);
    void getHp(int hp);
    void setHp(int hp);
}