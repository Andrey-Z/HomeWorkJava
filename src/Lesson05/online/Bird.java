package lesson05.online;

public class Bird extends Animals {


    public Bird(String name,float maxRun, float maxSwim, float maxJump) {
        super(name, maxRun, maxSwim, maxJump);
        //  System.out.println("Птица пробежала " + run + "м");
    }
    @Override
    public int swim(float FullTrack){
        return Animals.noSwim;
    }
}