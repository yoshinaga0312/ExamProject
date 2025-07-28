public interface Creature {
    void isAlive(boolean alive);
    void showStatus();
    void attack(Creature target);
    String getName();
    int getHp();
    void setHp(int hp);
}