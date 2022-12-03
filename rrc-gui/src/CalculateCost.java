import java.util.*;

public class CalculateCost {

    public static int totalRockets, total556, totalC4, totalSatchels, totalF1s, totalBeancans, totalHVs, totalHEs, totalMLRS;

    public static void resetTotal() {
        totalRockets = 0;
        total556 = 0;
        totalC4 = 0;
        totalSatchels = 0;
        totalF1s = 0;
        totalBeancans = 0;
        totalHVs = 0;
        totalHEs = 0;
        totalMLRS = 0;
    }
    public static void calc() {
        Data.reset();
        resetTotal();
        if (RustCalculator.blockQueue.isEmpty()) {
            System.out.println("The queue is empty! Try adding blocks or deployables to get the cost of a raid.");
            RustCalculator.promptEnter();
            RustCalculator.main(null);
        }

        Queue<String> aux = new LinkedList<>(RustCalculator.blockQueue);
        while (!aux.isEmpty()) {
            if (Objects.equals(aux.peek(), "twig block")) {
                double costRocket = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("Rocket"));
                double cost556 = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("Explosive 5.56"));
                double costC4 = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("C4"));
                double costSatchels = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("Satchel"));
                double costF1s = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("F1 Grenade"));
                double costBeancans = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("Beancan Grenade"));
                double costHVs = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("High Velocity Rocket"));
                double costHEs = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("40mm HE Grenade"));
                double costMLRS = (Data.buildingBlocks.get("Twig") / Data.dmgTwig.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wood block")) {
                double costRocket = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("Rocket"));
                double cost556 = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("Explosive 5.56"));
                double costC4 = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("C4"));
                double costSatchels = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("Satchel"));
                double costF1s = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("F1 Grenade"));
                double costBeancans = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("Beancan Grenade"));
                double costHVs = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("High Velocity Rocket"));
                double costHEs = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("40mm HE Grenade"));
                double costMLRS = (Data.buildingBlocks.get("Wood") / Data.dmgWood.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "stone block")) {
                double costRocket = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("Rocket"));
                double cost556 = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("Explosive 5.56"));
                double costC4 = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("C4"));
                double costSatchels = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("Satchel"));
                double costF1s = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("F1 Grenade"));
                double costBeancans = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("Beancan Grenade"));
                double costHVs = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("High Velocity Rocket"));
                double costHEs = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("40mm HE Grenade"));
                double costMLRS = (Data.buildingBlocks.get("Stone") / Data.dmgStone.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "metal block")) {
                double costRocket = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("Rocket"));
                double cost556 = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("Explosive 5.56"));
                double costC4 = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("C4"));
                double costSatchels = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("Satchel"));
                double costF1s = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("F1 Grenade"));
                double costBeancans = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("Beancan Grenade"));
                double costHVs = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("High Velocity Rocket"));
                double costHEs = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("40mm HE Grenade"));
                double costMLRS = (Data.buildingBlocks.get("Metal") / Data.dmgMetal.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "armor block")) {
                double costRocket = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("Rocket"));
                double cost556 = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("Explosive 5.56"));
                double costC4 = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("C4"));
                double costSatchels = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("Satchel"));
                double costF1s = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("F1 Grenade"));
                double costBeancans = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("Beancan Grenade"));
                double costHVs = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("High Velocity Rocket"));
                double costHEs = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("40mm HE Grenade"));
                double costMLRS = (Data.buildingBlocks.get("Armor") / Data.dmgArmor.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wooden bars deployable")) {
                double costRocket = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("Rocket"));
                double cost556 = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("C4"));
                double costSatchels = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("Satchel"));
                double costF1s = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Wooden Bars") / Data.dmgWoodenBars.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "strengthened glass deployable")) {
                double costRocket = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("Rocket"));
                double cost556 = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("C4"));
                double costSatchels = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("Satchel"));
                double costF1s = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Strengthened Glass") / Data.dmgStrengthenedGlass.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "metal bars deployable")) {
                double costRocket = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("Rocket"));
                double cost556 = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("C4"));
                double costSatchels = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("Satchel"));
                double costF1s = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Metal Bars") / Data.dmgMetalBars.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "reinforced glass deployable")) {
                double costRocket = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("Rocket"));
                double cost556 = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("C4"));
                double costSatchels = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("Satchel"));
                double costF1s = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Reinforced Glass") / Data.dmgReinforcedGlass.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wood deployable")) {
                double costRocket = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("Rocket"));
                double cost556 = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("C4"));
                double costSatchels = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("Satchel"));
                double costF1s = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Wood Door") / Data.dmgWoodDoor.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "metal deployable")) {
                double costRocket = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("Rocket"));
                double cost556 = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("C4"));
                double costSatchels = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("Satchel"));
                double costF1s = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Metal Door") / Data.dmgMetalDoor.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "armored deployable")) {
                double costRocket = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("Rocket"));
                double cost556 = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("C4"));
                double costSatchels = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("Satchel"));
                double costF1s = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Armor Door") / Data.dmgArmoredDoor.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "garage deployable")) {
                double costRocket = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("Rocket"));
                double cost556 = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("C4"));
                double costSatchels = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("Satchel"));
                double costF1s = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Garage Door") / Data.dmgGarageDoor.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wood wall deployable")) {
                double costRocket = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("Rocket"));
                double cost556 = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("C4"));
                double costSatchels = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("Satchel"));
                double costF1s = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("High Wooden Wall") / Data.dmgWoodWall.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "stone wall deployable")) {
                double costRocket = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("Rocket"));
                double cost556 = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("C4"));
                double costSatchels = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("Satchel"));
                double costF1s = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("High Stone Wall") / Data.dmgStoneWall.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wood gate deployable")) {
                double costRocket = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("Rocket"));
                double cost556 = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("C4"));
                double costSatchels = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("Satchel"));
                double costF1s = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Wood Gate") / Data.dmgWoodGate.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "stone gate deployable")) {
                double costRocket = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("Rocket"));
                double cost556 = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("C4"));
                double costSatchels = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("Satchel"));
                double costF1s = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Stone Gate") / Data.dmgStoneGate.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "stone deployable")) {
                double costRocket = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("Rocket"));
                double cost556 = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("C4"));
                double costSatchels = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("Satchel"));
                double costF1s = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Stone Barricade") / Data.dmgStoneBarricade.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wooden cover deployable")) {
                double costRocket = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("Rocket"));
                double cost556 = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("C4"));
                double costSatchels = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("Satchel"));
                double costF1s = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Wooden Cover") / Data.dmgWoodenCover.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "sandbag deployable")) {
                double costRocket = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("Rocket"));
                double cost556 = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("C4"));
                double costSatchels = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("Satchel"));
                double costF1s = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Sandbag") / Data.dmgSandbag.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "wood deployable")) {
                double costRocket = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("Rocket"));
                double cost556 = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("C4"));
                double costSatchels = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("Satchel"));
                double costF1s = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Wood Barricade") / Data.dmgWoodBarricade.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "barbed wood deployable")) {
                double costRocket = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("Rocket"));
                double cost556 = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("C4"));
                double costSatchels = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("Satchel"));
                double costF1s = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Barbed Wood Barricade") / Data.dmgBarbedWood.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "concrete deployable")) {
                double costRocket = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("Rocket"));
                double cost556 = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("C4"));
                double costSatchels = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("Satchel"));
                double costF1s = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Concrete Barricade") / Data.dmgConcrete.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "metal deployable")) {
                double costRocket = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("Rocket"));
                double cost556 = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("C4"));
                double costSatchels = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("Satchel"));
                double costF1s = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Metal Barricade") / Data.dmgMetalBarricade.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "triangle deployable")) {
                double costRocket = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("Rocket"));
                double cost556 = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("C4"));
                double costSatchels = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("Satchel"));
                double costF1s = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Triangle Hatch") / Data.dmgTriangleHatch.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "square deployable")) {
                double costRocket = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("Rocket"));
                double cost556 = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("C4"));
                double costSatchels = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("Satchel"));
                double costF1s = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Square Hatch") / Data.dmgSquareHatch.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "drop box deployable")) {
                double costRocket = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("Rocket"));
                double cost556 = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("C4"));
                double costSatchels = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("Satchel"));
                double costF1s = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Drop Box") / Data.dmgDropBox.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "small box deployable")) {
                double costRocket = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("Rocket"));
                double cost556 = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("C4"));
                double costSatchels = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("Satchel"));
                double costF1s = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Small Box") / Data.dmgSmallBox.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "fridge deployable")) {
                double costRocket = (Data.deployables.get("Fridge") / Data.dmgFridge.get("Rocket"));
                double cost556 = (Data.deployables.get("Fridge") / Data.dmgFridge.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Fridge") / Data.dmgFridge.get("C4"));
                double costSatchels = (Data.deployables.get("Fridge") / Data.dmgFridge.get("Satchel"));
                double costF1s = (Data.deployables.get("Fridge") / Data.dmgFridge.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Fridge") / Data.dmgFridge.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Fridge") / Data.dmgFridge.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Fridge") / Data.dmgFridge.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Fridge") / Data.dmgFridge.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "large box deployable")) {
                double costRocket = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("Rocket"));
                double cost556 = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("C4"));
                double costSatchels = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("Satchel"));
                double costF1s = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Large Box") / Data.dmgLargeBox.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "locker deployable")) {
                double costRocket = (Data.deployables.get("Locker") / Data.dmgLocker.get("Rocket"));
                double cost556 = (Data.deployables.get("Locker") / Data.dmgLocker.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Locker") / Data.dmgLocker.get("C4"));
                double costSatchels = (Data.deployables.get("Locker") / Data.dmgLocker.get("Satchel"));
                double costF1s = (Data.deployables.get("Locker") / Data.dmgLocker.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Locker") / Data.dmgLocker.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Locker") / Data.dmgLocker.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Locker") / Data.dmgLocker.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Locker") / Data.dmgLocker.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "vending machine deployable")) {
                double costRocket = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("Rocket"));
                double cost556 = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("C4"));
                double costSatchels = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("Satchel"));
                double costF1s = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Vending Machine") / Data.dmgVendingMachine.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "fence deployable")) {
                double costRocket = (Data.deployables.get("Fence") / Data.dmgFence.get("Rocket"));
                double cost556 = (Data.deployables.get("Fence") / Data.dmgFence.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Fence") / Data.dmgFence.get("C4"));
                double costSatchels = (Data.deployables.get("Fence") / Data.dmgFence.get("Satchel"));
                double costF1s = (Data.deployables.get("Fence") / Data.dmgFence.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Fence") / Data.dmgFence.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Fence") / Data.dmgFence.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Fence") / Data.dmgFence.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Fence") / Data.dmgFence.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
            if (Objects.equals(aux.peek(), "gate deployable")) {
                double costRocket = (Data.deployables.get("Gate") / Data.dmgGate.get("Rocket"));
                double cost556 = (Data.deployables.get("Gate") / Data.dmgGate.get("Explosive 5.56"));
                double costC4 = (Data.deployables.get("Gate") / Data.dmgGate.get("C4"));
                double costSatchels = (Data.deployables.get("Gate") / Data.dmgGate.get("Satchel"));
                double costF1s = (Data.deployables.get("Gate") / Data.dmgGate.get("F1 Grenade"));
                double costBeancans = (Data.deployables.get("Gate") / Data.dmgGate.get("Beancan Grenade"));
                double costHVs = (Data.deployables.get("Gate") / Data.dmgGate.get("High Velocity Rocket"));
                double costHEs = (Data.deployables.get("Gate") / Data.dmgGate.get("40mm HE Grenade"));
                double costMLRS = (Data.deployables.get("Gate") / Data.dmgGate.get("MLRS Rocket"));
                totalRockets += (int) Math.round(costRocket);
                total556 += (int) Math.round(cost556);
                totalC4 += (int) Math.round(costC4);
                totalSatchels += (int) Math.round(costSatchels);
                totalF1s += (int) Math.round(costF1s);
                totalBeancans += (int) Math.round(costBeancans);
                totalHVs += (int) Math.round(costHVs);
                totalHEs += (int) Math.round(costHEs);
                totalMLRS += (int) Math.round(costMLRS);
                aux.remove();
            }
        }
        cheapest();
        System.out.println("Total Cost:" +
                "\nRockets: " + totalRockets +
                "\nExplosive 5.56: " + total556 +
                "\nC4: " + totalC4 +
                "\nSatchels: " + totalSatchels +
                "\nF1 Grenades: " + totalF1s +
                "\nBeancan Grenades: " + totalBeancans +
                "\nHigh Velocity Rockets: " + totalHVs +
                "\n40mm HE Grenades: " + totalHEs +
                "\nMLRS Rockets: " + totalMLRS +
                "\n\nCheapest way to raid is by using : " + tool + ", the sulfur cost would be: " + sulfurCost);
        RustCalculator.promptEnter();
        RustCalculator.main(null);
    }
    public static int sulfurCost;
    public static String tool;

    public static void cheapest() {
        double totalSulfRockets = totalRockets * Data.sulfurCosts.get("Rocket");
        double totalSulf556 = total556 * Data.sulfurCosts.get("Explosive 5.56");
        double totalSulfC4 = totalC4 * Data.sulfurCosts.get("C4");
        double totalSulfSatchels = totalSatchels * Data.sulfurCosts.get("Satchel");
        double totalSulfF1s = totalF1s * Data.sulfurCosts.get("F1 Grenade");
        double totalSulfBeancans = totalBeancans * Data.sulfurCosts.get("Beancan Grenade");
        double totalSulfHVs = totalHVs * Data.sulfurCosts.get("High Velocity Rocket");
        Set<Double> costsSorted = new TreeSet<>();
        costsSorted.add(totalSulfRockets);
        costsSorted.add(totalSulf556);
        costsSorted.add(totalSulfC4);
        costsSorted.add(totalSulfSatchels);
        costsSorted.add(totalSulfF1s);
        costsSorted.add(totalSulfBeancans);
        costsSorted.add(totalSulfHVs);

        Iterator<Double> itr = costsSorted.iterator();
        double least = itr.next();
        sulfurCost = (int) Math.round(least);
        if (least == totalSulfRockets) {
            tool = "Rockets";
        }
        if (least == totalSulf556) {
            tool = "Explosive 5.56 Rounds";
        }
        if (least == totalSulfC4) {
            tool = "C4";
        }
        if (least == totalSulfSatchels) {
            tool = "Satchels";
        }
        if (least == totalSulfF1s) {
            tool = "F1 Grenades";
        }
        if (least == totalSulfBeancans) {
            tool = "Beancan Grenades";
        }
        if (least == totalSulfHVs) {
            tool = "High Velocity Rockets";
        }
    }
}
