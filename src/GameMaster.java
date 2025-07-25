import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        Hero h = new Hero("勇者", 100, "剣");
        Wizard w = new Wizard("魔法使い", 60, 20);
        Thief t = new Thief("盗賊", 70);
        characters.add(h);
        characters.add(w);
        characters.add(t);

        ArrayList<Monster> monsters = new ArrayList<>();
        Matango m = new Matango( 45, 'A');
        Goblin g = new Goblin( 50, 'A');
        Slime s = new Slime(40, 'A');
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);

        System.out.println("---味方パーティ---");
        h.showStatus();
        w.showStatus();
        t.showStatus();
        System.out.println("---敵グループ---");
        m.showStatus();
        g.showStatus();
        s.showStatus();

        System.out.println("\n味方の総攻撃!");
        for(Character c : characters) {
           for (Monster mon : monsters) {
               c.attack(mon);
           }
        }
        System.out.println("\n敵の総攻撃!");
        for(Monster mon : monsters) {
            for (Character c : characters) {
                mon.attack(c);
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光りだした!");
        System.out.println("勇者はスーパーヒーローに進化した!");
        SuperHero Sp = new SuperHero(h);
        int index = characters.indexOf(h);
        characters.set(index,Sp);
        Sp.attack(m);
        Sp.attack(g);
        Sp.attack(s);

        System.out.println("\n---味方パーティ最終ステータス---");
        h.showStatus();
        System.out.println("生存状況:" + h.isAlive());
        w.showStatus();
        System.out.println("生存状況:" + w.isAlive());
        t.showStatus();
        System.out.println("生存状況:" + t.isAlive());
        System.out.println("\n---敵グループ最終ステータス---");
        m.showStatus();
        System.out.println("生存状況:" + m.isAlive());
        g.showStatus();
        System.out.println("生存状況:" + g.isAlive());
        s.showStatus();
        System.out.println("生存状況:" + s.isAlive());
    }
}
