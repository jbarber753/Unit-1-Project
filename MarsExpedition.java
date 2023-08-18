import java.util.InputMismatchException;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Booting...");
        Thread.sleep(250);
        System.out.println("Booting...");
        Thread.sleep(250);
        System.out.println("Booting...");
        Thread.sleep(250);
        System.out.println("Flip-flopping...");
        Thread.sleep(250);
        System.out.println("Booting...");
        Thread.sleep(250);
        System.out.println("Successfully booted. Please enter your name:");
        String name = input.nextLine();
        System.out.println("Hello, " + name + ". Welcome to the expedition. Are you ready to go expediting? Y/N");
        String response = input.nextLine();
        if(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Good. Not that you had a choice.");
        }
        else if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")){
            System.out.println("Well that's a shame. You're going anyway, though.");
        }
        else{
            System.out.println("Invalid response. Per our protocol, this has been automatically translated a \"yes.\" Thank you!");
        }
        Thread.sleep(250);
        System.out.println("How many team members will you bring on the mission?");
        int team;
        try{
            team = input.nextInt();
        }
        catch (InputMismatchException e){
            String bad_input = input.next();
            System.out.println("Invalid input. You're bringing two people, stop being difficult.");
            team = 2;
        }
        if (team == 2){
            System.out.println("Great, we were going to send two anyway.");
        }
        else if (team > 2){
            System.out.println("Greedy... That's way too many. You get two.");
        }
        else if (team < 2 && team >= 0){
            System.out.println("You want fewer than 2 people? Well, I'm not one to say no to a budget cut. Proceed.");
        }
        else{
            System.out.println("You can't have a negative number of team members, Einstein. You're getting nobody, since you like to cause problems. Have fun.");
        }
        input.nextLine();
        Thread.sleep(250);
        System.out.println("Now you will need to pick a snack. Budget constraints limit you to one snack. What will you bring?");
        String snack = input.nextLine();
        System.out.println("Very well, you will bring " + snack + ". Consider it a treat.");
        Thread.sleep(250);
        System.out.println("You have three choices of vehicles. Please choose now (enter a number): \n1: UNSC Warthog \n2: Landmaster Tank \n3: Charles the space horse");
        String vehicle = input.nextLine();
        if (vehicle.equals("1")){
            System.out.println("Good, you'll get a Warthog");
            vehicle = "UNSC Warthog";
        }
        else if (vehicle.equals("2")){
            System.out.println("Good, you'll get a Landmaster.");
            vehicle = "Landmaster Tank";
        }
        else if (vehicle.equals("3")){
            System.out.println("Most excellent, ye shall mount Charles, the fleet of foot. A worthy steed, indeed.");
            vehicle = "Charles the space horse";
        }
        else{
            System.out.println("Somebody didn't follow instructions. Guess who gets to walk now? You. It's you.");
            vehicle = "None";
        }
        Thread.sleep(250);
        System.out.println("Alright, here's the final expedition plan: \nCaptain name: " + name + "\nTeam count: " + team + "\nSnack of choice: " + snack + "\nVehicle: " + vehicle);
        Thread.sleep(250);
        System.out.println("Bon voyage, and godspeed!");
    }
}
