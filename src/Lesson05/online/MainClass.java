package lesson05.online;

public class MainClass {
    public static void main(String[] args) {
        String success = " получается";
        String noSuccess = " не получается";
        String newEvent;
        String fullResult;


        Dog dog = new Dog( "Pesik", 500,10, 0.5f);
        Horse horse = new Horse("Poni",1500, 100, 3);
        Bird bird = new Bird("Kesha",5, 0, 0.2f);
        Cat cat = new Cat("Murka",200, 0, 2);

        Animals[] massiv = {dog, horse, bird, cat};
        float runStart = 400;
        float jumpStart = 1.1f;
        float swimStart = 15;

        for (int i = 0; i < massiv.length ; i++) {
            String nameString = "Животное "+ massiv[i].getName() + " умеет ";

            newEvent = "бежать на " + massiv[i].getMaxRun() + " метров, пытается пробежать ";
            fullResult = massiv[i].run(runStart) ? success : noSuccess;
            results(nameString, newEvent, runStart, fullResult);

            newEvent = "прыгать на " + massiv[i].getMaxJump() + " метров, пытается  прыгает ";
            fullResult = (massiv[i].jump(jumpStart)) ? success : noSuccess;
            results(nameString, newEvent, jumpStart, fullResult);

            int swimResult = massiv[i].swim(swimStart);
            newEvent = "плыть на " + massiv[i].getMaxSwim() + " метров, и пытается  плыть  ";
            fullResult = (swimResult == Animals.swimYes) ? success : noSuccess;

            if (swimResult == Animals.noSwim)
                fullResult = " ничего не вышло, т.к не умеет плавать!";
            results(nameString, newEvent, swimStart, fullResult);
        }

    }
    private static void results(String animalName, String nameEvent, float sizeEvent, String eventResults) {
        System.out.println(animalName + nameEvent + sizeEvent + " метров и у него это" + eventResults);
    }

}