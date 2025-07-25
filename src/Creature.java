public interface Creature {
    void isAlive(boolean alive);
    void showStatus();
    void attack(Creature target);
    void getName(String name);
    String getHp();
    void setHp(int hp);
}