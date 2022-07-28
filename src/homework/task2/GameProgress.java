package homework.task2;

import java.io.Serial;
import java.io.Serializable;

public class GameProgress implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

//    private transient int health; //transient - обнуляет значение, не дает записывать
    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}
