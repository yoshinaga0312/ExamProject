public interface Creature {
    public boolean isAlive();
    void showStatus();
    void attack(Character target);
    void getName(String name);
    void getHp(int hp);
    void setHp();

}