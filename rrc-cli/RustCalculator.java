import java.util.*;

public class RustCalculator {

    public static Queue<String> blockQueue = new LinkedList<>();

    public static void main(String[] args) {
        Data.reset();
        System.out.println("Welcome, select an option:");
        System.out.println("""
                [1] Select Building Block(s)
                [2] Select Deployable(s)
                [3] Calculate Cost
                [4] Print Queue
                [5] Clear Queue""");
        mainUserInput();
    }

    public static void mainUserInput() {
        Scanner input = new Scanner(System.in);
        String entered = input.nextLine();
        int parsed = 0;
        try {
            parsed = Integer.parseInt(entered);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number between 1-5");
            mainUserInput();
        }
        if (parsed < 1 || parsed > 5) {
            System.out.println("Please enter a number between 1-5");
            mainUserInput();
        }
        if (parsed == 1) {
            System.out.println("Please enter a valid block tier. " +
                    "Type \"!full\" to see a full list of choices or type \"!home\" to go back home.");
            selectBlock();
        }
        if (parsed == 2) {
            System.out.println("Please enter a valid type of deployable. " +
                    "Type \"!full\" to see a full list of choices or type \"!home\" to go back home.");
            selectDeployableType();
        }
        if (parsed == 3) {
            CalculateCost.calc();
        }
        if (parsed == 4) {
            showQueue();
        }
        if (parsed == 5) {
            clearQueue();
        }
    }

    private static int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int parsed;
        try {
            parsed = Integer.parseInt(str);
            return parsed;
        } catch (NumberFormatException e) {
            System.out.println("Please pick a number between 1-3");
            getIntegerInput();
        }
        return 0;
    }

    public static void promptEnter(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    private static void selectBlock() {
        Scanner input = new Scanner(System.in);
        String entered = input.nextLine().toLowerCase();
        if (entered.trim().equalsIgnoreCase("twig")
                || entered.trim().equalsIgnoreCase("wood")
                || entered.trim().equalsIgnoreCase("stone")
                || entered.trim().equalsIgnoreCase("metal")
                || entered.trim().equalsIgnoreCase("armor")) {
            System.out.println("How many blocks do you want to add to the queue?");
            int amount = getIntegerInput();
            blockQueueAdd(entered, amount);
        }
        if (Objects.equals(entered, "!full")) {
            System.out.println("List of valid tiers: [Twig] [Wood] [Stone] [Metal] [Armor]");
            promptEnter();
            System.out.println("Please enter a valid block tier. " +
                    "Type \"!full\" to see a full list of choices or type \"!home\" to go back home.");
            selectBlock();
        }
        if (Objects.equals(entered, "!home")) {
            main(null);
        }
        else {
            System.out.println("Please enter a valid tier. Type \"!full\" to get a full list of blocks available. ");
            promptEnter();
            System.out.println("Please enter a valid block tier. " +
                    "Type \"!full\" to see a full list of choices or type \"!home\" to go back home.");
            selectBlock();
        }
    }

    private static void blockQueueAdd(String tier, int amount) {
        for (int i = 0; i < amount; i++) {
            blockQueue.add(tier + " block");
        }
        System.out.println("Successfully added " + amount + " " + tier + " blocks to the queue!");
        promptEnter();
        main(null);
    }

    private static void selectDeployableType() {
        Scanner input = new Scanner(System.in);
        String entered = input.nextLine().toLowerCase();
        if (entered.trim().equalsIgnoreCase("door")
                || entered.trim().equalsIgnoreCase("window")
                || entered.trim().equalsIgnoreCase("external")
                || entered.trim().equalsIgnoreCase("barricade")
                || entered.trim().equalsIgnoreCase("hatch")
                || entered.trim().equalsIgnoreCase("storage")
                || entered.trim().equalsIgnoreCase("fence")) {
            selectDeployable(entered);
        }
        if (entered.trim().equalsIgnoreCase("!full")) {
            System.out.println("List of valid types: [Door], [Window], [External], [Barricade], [Hatch], [Storage], [Fence]");
            promptEnter();
            System.out.println("Please enter a valid type of deployable. " +
                    "Type \"!full\" to see a full list of choices or type \"!home\" to go back home.");
            selectDeployableType();
        }
        if (entered.trim().equalsIgnoreCase("!home")) {
            main(null);
        }
        else {
            System.out.println("Please select a valid type. Type \"!full\" to get a full list of blocks available. ");
            promptEnter();
            System.out.println("Please enter a valid type of deployable. " +
                    "Type \"!full\" to see a full list of choices or type \"!home\" to go back home.");
            selectDeployableType();
        }
    }

    private static void selectDeployable(String type) {
        if (type.trim().equalsIgnoreCase("window")) {
            System.out.println("Enter one of the following window deployables:" +
                    " [Wooden Bars], [Strengthened Glass], [Metal Bars], [Reinforced Glass]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("wooden bars")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("strengthened glass")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("metal bars")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("reinforced glass")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid window deployable.");
                promptEnter();
                selectDeployable("window");
            }
        }
        if (type.trim().equalsIgnoreCase("door")) {
            System.out.println("Enter one of the following door deployables:" +
                    " [Wood], [Metal], [Armored], [Garage]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("wood")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("metal")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("armored")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("garage")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid door deployable.");
                promptEnter();
                selectDeployable("door");
            }
        }
        if (type.trim().equalsIgnoreCase("external")) {
            System.out.println("Enter one of the following external deployables:" +
                    " [Wood Wall], [Wood Gate], [Stone Wall], [Stone Gate]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("wood wall")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("wood gate")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("stone wall")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("stone gate")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid external deployable.");
                promptEnter();
                selectDeployable("external");
            }
        }
        if (type.trim().equalsIgnoreCase("barricade")) {
            System.out.println("Enter one of the following barricade deployables:" +
                    " [Stone], [Wooden Cover], [Sandbag], [Wood], [Barbed Wood], [Concrete], [Metal]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("stone")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("wooden cover")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("sandbag")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("wood")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("barbed wood")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("concrete")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("metal")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid barricade deployable.");
                promptEnter();
                selectDeployable("barricade");
            }
        }
        if (type.trim().equalsIgnoreCase("hatch")) {
            System.out.println("Enter one of the following hatch deployables:" +
                    " [Triangle], [Square]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("triangle")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("square")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid hatch deployable.");
                promptEnter();
                selectDeployable("hatch");
            }
        }
        if (type.trim().equalsIgnoreCase("storage")) {
            System.out.println("Enter one of the following storage deployables:" +
                    " [Drop Box], [Small Box], [Fridge], [Large Box], [Locker], [Vending Machine]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("drop box")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("small box")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("fridge")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("large box")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("locker")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("vending machine")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid storage deployable.");
                promptEnter();
                selectDeployable("storage");
            }
        }
        if (type.trim().equalsIgnoreCase("fence")) {
            System.out.println("Enter one of the following fence deployables: [Gate], [Fence]:");
            Scanner input = new Scanner(System.in);
            String entered = input.nextLine();
            if (entered.trim().equalsIgnoreCase("gate")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            if (entered.trim().equalsIgnoreCase("fence")) {
                System.out.println("How many deployables do you want to add to the queue?");
                int amount = getIntegerInput();
                deployableQueueAdd(entered, amount);
            }
            else {
                System.out.println("Enter a valid fence deployable.");
                promptEnter();
                selectDeployable("fence");
            }
        }
    }

    private static void deployableQueueAdd(String type, int amount) {
        for (int i = 0; i < amount; i++) {
            blockQueue.add(type + " deployable");
        }
        System.out.println("Successfully added " + amount + " " + type + " deployables to the queue!");
        promptEnter();
        main(null);
    }

    private static void clearQueue() {
        if (blockQueue.isEmpty()) {
            System.out.println("The queue is already empty.");
            promptEnter();
            main(null);
        }
        while (!blockQueue.isEmpty()) {
            blockQueue.remove();
        }
        System.out.println("The queue has been cleared.");
        promptEnter();
        main(null);
    }

    private static void showQueue() {
        if (blockQueue.isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            System.out.println(blockQueue);
        }
        promptEnter();
        main(null);
    }

}
