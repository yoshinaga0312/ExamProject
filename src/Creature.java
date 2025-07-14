public interface Creature {
    void isAlive(boolean alive);
    void showStatus();
    void attack(Character target);
    void attack(Monster target);
    void getName(String name);
    String getHp();
    void setHp(int hp);
}