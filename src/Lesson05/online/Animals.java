package lesson05.online;

public abstract class Animals {

    private String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;

    public static int swimYes = 1;
    public static int swimNo = 0;
    public static int noSwim = -1;

    public Animals (String name,float maxRun, float maxSwim, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
        //    System.out.println("Родительский конструктор ");
    }

    String getName(){
        return this.name;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim(){
        return this.maxSwim;
    }

    float getMaxJump(){
        return this.maxJump;
    }

    public boolean run(float fullTrack) {
        return (fullTrack <= maxRun);
    }

    public int swim(float fullTrack) {
        return (fullTrack <= maxSwim) ? swimYes : swimNo;
    }

    public boolean jump (float fullJump) {
        return (fullJump <= maxJump);
    }
}