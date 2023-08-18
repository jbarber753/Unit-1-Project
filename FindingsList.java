import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        ArrayList<String> rocks = new ArrayList<String>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not-a-rock");
        Thread.sleep(500);
        System.out.println("Oh... you're back already? Well... you got some rocks for me?");
        Thread.sleep(500);
        System.out.println("Rock data downloaded. Here are the rocks:");
        Thread.sleep(250);
        System.out.println(rocks);
        Thread.sleep(500);
        System.out.println("Hol up... What is that? What is THAT? Get it out of here! Get it out of here now!");
        rocks.remove("not-a-rock");
        Thread.sleep(500);
        System.out.println("There... the natural order is restored. Here are all the actual rocks:");
        System.out.println(rocks);
        Thread.sleep(1000);
        System.out.println("Oh look, you got some fossils too! Let me download that data.");
        HashMap<String, String> fossils = new HashMap<String, String>();
        Thread.sleep(1000);
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Alright, got it. Which fossil would you like to analyze? (Capitalization and spacing matters)");
        Scanner input = new Scanner(System.in);
        String fossil = input.nextLine();
        if (fossil.equals("Bird Fossil") || fossil.equalsIgnoreCase("Fish Fossil") || fossil.equalsIgnoreCase("Tooth Fossil")){
            System.out.println(fossils.get(fossil));
        }
        else{
            System.out.println("Whatchu talkin' 'bout, Willis? Fossil analysis privileges revoked.");
        }
        Thread.sleep(750);
        System.out.println("Let's take a look at the supplies you used up. Pre-expedition supplies:");
        HashSet<String> supplies = new HashSet<String>();
        supplies.add("Towel");
        supplies.add("Screwdriver");
        supplies.add("Snack bag");
        System.out.println(supplies);
        supplies.remove("Towel");
        Thread.sleep(750);
        System.out.println("Supplies post-expedition:");
        System.out.println(supplies);
        Thread.sleep(750);
        System.out.println("You fool! You've lost your towel! That's the most important thing, you can't lose that! Go back and find it.");
    }
}
