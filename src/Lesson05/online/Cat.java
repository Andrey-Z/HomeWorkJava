package lesson05.online;

public class Cat extends Animals {


    public Cat(String name, float maxRun, float maxSwim, float maxJump) {
        super(name, maxRun, maxSwim, maxJump);
        // System.out.println("Кот пробежал " + run + "м");
    }

    @Override
    public int swim(float FullTrack) {
        return Animals.noSwim;
    }
}