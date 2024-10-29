package Lab_07;

public class SpeedController {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal dog = new Dog();

        int tigerSpeed = tiger.speed();
        int horseSpeed = horse.speed();
        int dogSpeed = dog.speed();

        int maxSpeed = Math.max(tigerSpeed, Math.max(horseSpeed, dogSpeed));
        String winner;
        System.out.println("The speed of tiger: "+ tigerSpeed);
        System.out.println("The speed of horse: "+horseSpeed);
        System.out.println("The speed of dog: "+dogSpeed);

        if(maxSpeed<=tigerSpeed && maxSpeed > horseSpeed){
            winner= tiger.getClass().getSimpleName();
        } else if (maxSpeed<= horseSpeed && maxSpeed>dogSpeed) {
            winner=horse.getClass().getSimpleName();
        }else {
            winner=dog.getClass().getSimpleName();
        }
        System.out.println("Winner is "+ winner+", with speed: "+ maxSpeed);
    }
}
