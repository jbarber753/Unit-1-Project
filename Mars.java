public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Funkytown";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        meals = meals - (0.75 * shipPopulation);
        meals = meals - (0.75 * shipPopulation);
        System.out.println(meals);
        meals = meals * 1.5;
        shipPopulation += 5;
        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plains")){
            System.out.println("Bbzzz Landing on the Plain");
        }
        else{
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landingCheck(10);
        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute < minutesLeft; minute++){
            if (minute % 3 == 0 && minute % 2 == 0){
                System.out.println("Keep center");
            }
            else if (minute % 3 == 0){
                System.out.println("Left");
            }
            else if (minute % 2 == 0){
                System.out.println("Right");
            }
            else{
                System.out.println("Calculating...");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
