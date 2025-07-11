import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        Hero h = new Hero("勇者",100,"銅の剣");
        Wizard w = new Wizard("魔法使い",60,10);
        Thief t = new Thief("盗賊",70);
        characters.add(h);
        characters.add(w);
        characters.add(t);

        ArrayList<Monster> monsters = new ArrayList<>();
        Matango m = new Matango("お化けキノコ",45, 'A');
        Goblin g = new Goblin("ゴブリン",50, 'A');
        Slime s = new Slime("スライム",40, 'A');
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);


        System.out.println("---味方パーティ---");



    }
}
