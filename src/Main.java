import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        //Objects
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                keyboard.nextLine();
                                System.out.println("Enter name of animal: ");
                                tigerObject.setNameOfAnimal(keyboard.nextLine());
                                System.out.println("Enter weight: ");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter age: ");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter speed: ");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter sound level of roar: ");
                                tigerObject.setSoundLevel(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Tiger name: " + tigerObject.getNameOfAnimal());
                                System.out.println("Tiger weight: " + tigerObject.getWeight());
                                System.out.println("Tiger height: " + tigerObject.getHeight());
                                System.out.println("Tiger age: " + tigerObject.getAge());
                                System.out.println("Tiger speed: " + tigerObject.getSpeed());
                                System.out.println("Tiger number of stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Tiger sound level of roar: " + tigerObject.getSoundLevel());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                keyboard.nextLine();
                                System.out.println("Enter name of animal: ");
                                dolphinObject.setNameOfAnimal(keyboard.nextLine());
                                System.out.println("Enter weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter age: ");
                                dolphinObject.setAge(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter color of the dolphin: ");
                                dolphinObject.setColorOfDolphin(keyboard.nextLine());
                                System.out.println("Enter swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Dolphin name: " + dolphinObject.getNameOfAnimal());
                                System.out.println("Dolphin weight: " + dolphinObject.getWeight());
                                System.out.println("Dolphin height: " + dolphinObject.getHeight());
                                System.out.println("Dolphin age: " + dolphinObject.getAge());
                                System.out.println("Dolphin color: " + dolphinObject.getColorOfDolphin());
                                System.out.println("Dolphin swimming speed: " + dolphinObject.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                keyboard.nextLine();
                                System.out.println("Enter name of animal: ");
                                penguinObject.setNameOfAnimal(keyboard.nextLine());
                                System.out.println("Enter weight: ");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter age: ");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Is the penguin swimming (true/false)");
                                penguinObject.setIsSwimming(keyboard.nextBoolean());
                                System.out.println("Enter the walk speed of the penguin: ");
                                penguinObject.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Enter the swim speed of the penguin: ");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Penguin name: " + penguinObject.getNameOfAnimal());
                                System.out.println("Penguin weight: " + penguinObject.getWeight());
                                System.out.println("Penguin height: " + penguinObject.getHeight());
                                System.out.println("Penguin age: " + penguinObject.getAge());
                                System.out.println("Penguin walking speed: " + penguinObject.getWalkSpeed());
                                System.out.println("Penguin swimming speed: " + penguinObject.getSwimSpeed());
                                break;
                            case 3:
                                if(!penguinObject.getIsSwimming()) {
                                    penguinObject.walking();
                                }
                                else {
                                    penguinObject.swimming();
                                }
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");


        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



