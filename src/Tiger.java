public class Tiger extends Animal implements Walk{

    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public Tiger() {
        super.setNameOfAnimal("Tiger");
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }
    public int getNumberOfStripes() {
        return this.numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int tigerSpeed) {
        this.speed = tigerSpeed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }
    public void setSoundLevel(int soundLevelOfRoar) {
        this.soundLevel = soundLevelOfRoar;
    }
    @Override
    public void eatingFood() {
        System.out.println("Tiger: I'm eating delicious meat");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed " + speed + " mph");
    }

}