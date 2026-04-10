public class Penguin extends Animal implements Swim, Walk{

    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin() {
        super.setNameOfAnimal("Penguin");
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }
    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    public int getSwimSpeed() {
        return swimSpeed;
    }

    //Interface Eat
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    //Interface Swim
    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    //Interface Walk
    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }
}