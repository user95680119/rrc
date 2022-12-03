package com.example.rrc;

import java.util.*;

public class Data {

    // I used HashMaps to easily have health values and names associated with each other.
    public static HashMap<String, Double> buildingBlocks, deployables, dmgTwig, dmgWood, dmgStone, dmgMetal, dmgArmor,
            dmgWoodenBars, dmgStrengthenedGlass, dmgMetalBars, dmgReinforcedGlass, dmgWoodDoor, dmgMetalDoor, dmgArmoredDoor,
            dmgGarageDoor, dmgWoodWall, dmgStoneWall, dmgWoodGate, dmgStoneGate, dmgStoneBarricade, dmgWoodenCover,
            dmgSandbag, dmgWoodBarricade, dmgBarbedWood, dmgConcrete, dmgMetalBarricade, dmgTriangleHatch, dmgSquareHatch,
            dmgDropBox, dmgSmallBox, dmgFridge, dmgLargeBox, dmgLocker, dmgVendingMachine, dmgFence, dmgGate, sulfurCosts;

    public static void reset() {
        // Data of damage towards Wooden Bars
        dmgWoodenBars = new HashMap<>();
        dmgWoodenBars.put("Explosive 5.56", 5.102040816);
        dmgWoodenBars.put("Rocket", 125.0);
        dmgWoodenBars.put("C4", 250.0);
        dmgWoodenBars.put("Satchel", 83.3334);
        dmgWoodenBars.put("F1 Grenade", 4.237288136);
        dmgWoodenBars.put("Beancan Grenade", 19.23076923);
        dmgWoodenBars.put("High Velocity Rocket", 27.77777778);
        dmgWoodenBars.put("40mm HE Grenade", 31.25);
        dmgWoodenBars.put("MLRS Rocket", 250.0);

        // Data of damage towards Strengthened Glass
        dmgStrengthenedGlass = new HashMap<>();
        dmgStrengthenedGlass.put("Explosive 5.56", 2.5);
        dmgStrengthenedGlass.put("Rocket", 116.6666667);
        dmgStrengthenedGlass.put("C4", 175.0);
        dmgStrengthenedGlass.put("Satchel", 38.88888889);
        dmgStrengthenedGlass.put("F1 Grenade", 1.005747126);
        dmgStrengthenedGlass.put("Beancan Grenade", 8.974358974);
        dmgStrengthenedGlass.put("High Velocity Rocket", 14.58333333);
        dmgStrengthenedGlass.put("40mm HE Grenade", 17.5);
        dmgStrengthenedGlass.put("MLRS Rocket", 175.0);

        // Data of damage towards Metal Bars
        dmgMetalBars = new HashMap<>();
        dmgMetalBars.put("Explosive 5.56", 2.5);
        dmgMetalBars.put("Rocket", 125.0);
        dmgMetalBars.put("C4", 250.0);
        dmgMetalBars.put("Satchel", 41.66666667);
        dmgMetalBars.put("F1 Grenade", 1.006036217);
        dmgMetalBars.put("Beancan Grenade", 8.928571429);
        dmgMetalBars.put("High Velocity Rocket", 14.70588235);
        dmgMetalBars.put("40mm HE Grenade", 17.24137931);
        dmgMetalBars.put("MLRS Rocket", 166.6666667);

        // Data of damage towards Reinforced Glass
        dmgReinforcedGlass = new HashMap<>();
        dmgReinforcedGlass.put("Explosive 5.56", 2.5);
        dmgReinforcedGlass.put("Rocket", 125.0);
        dmgReinforcedGlass.put("C4", 250.0);
        dmgReinforcedGlass.put("Satchel", 41.66666667);
        dmgReinforcedGlass.put("F1 Grenade", 1.006036217);
        dmgReinforcedGlass.put("Beancan Grenade", 8.928571429);
        dmgReinforcedGlass.put("High Velocity Rocket", 14.70588235);
        dmgReinforcedGlass.put("40mm HE Grenade", 17.24137931);
        dmgReinforcedGlass.put("MLRS Rocket", 166.6666667);

        // Data of damage towards Wooden Doors
        dmgWoodDoor = new HashMap<>();
        dmgWoodDoor.put("Explosive 5.56", 10.52631579);
        dmgWoodDoor.put("Rocket", 200.0);
        dmgWoodDoor.put("C4", 200.0);
        dmgWoodDoor.put("Satchel", 100.0);
        dmgWoodDoor.put("F1 Grenade", 8.695652174);
        dmgWoodDoor.put("Beancan Grenade", 33.33333333);
        dmgWoodDoor.put("High Velocity Rocket", 50.0);
        dmgWoodDoor.put("40mm HE Grenade", 66.66666667);
        dmgWoodDoor.put("MLRS Rocket", 200.0);

        // Data of damage towards Metal Doors
        dmgMetalDoor = new HashMap<>();
        dmgMetalDoor.put("Explosive 5.56", 3.968253968);
        dmgMetalDoor.put("Rocket", 125.0);
        dmgMetalDoor.put("C4", 250.0);
        dmgMetalDoor.put("Satchel", 62.5);
        dmgMetalDoor.put("F1 Grenade", 5.0);
        dmgMetalDoor.put("Beancan Grenade", 13.88888889);
        dmgMetalDoor.put("High Velocity Rocket", 22.72727273);
        dmgMetalDoor.put("40mm HE Grenade", 27.77777778);
        dmgMetalDoor.put("MLRS Rocket", 250.0);

        // Data of damage towards Armored Doors
        dmgArmoredDoor = new HashMap<>();
        dmgArmoredDoor.put("Explosive 5.56", 4.0);
        dmgArmoredDoor.put("Rocket", 200.0);
        dmgArmoredDoor.put("C4", 400.0);
        dmgArmoredDoor.put("Satchel", 66.66666667);
        dmgArmoredDoor.put("F1 Grenade", 5.0);
        dmgArmoredDoor.put("Beancan Grenade", 14.28571429);
        dmgArmoredDoor.put("High Velocity Rocket", 23.52941176);
        dmgArmoredDoor.put("40mm HE Grenade", 17.24137931);
        dmgArmoredDoor.put("MLRS Rocket", 266.6666667);

        // Data of damage towards Garage Doors
        dmgGarageDoor = new HashMap<>();
        dmgGarageDoor.put("Explosive 5.56", 4.0);
        dmgGarageDoor.put("Rocket", 200.0);
        dmgGarageDoor.put("C4", 300.0);
        dmgGarageDoor.put("Satchel", 66.66666666666667);
        dmgGarageDoor.put("F1 Grenade", 5.0);
        dmgGarageDoor.put("Beancan Grenade", 14.285714286);
        dmgGarageDoor.put("High Velocity Rocket", 24.0);
        dmgGarageDoor.put("40mm HE Grenade", 27.272727273);
        dmgGarageDoor.put("MLRS Rocket", 200.0);

        // Data of damage towards Wooden High Walls
        dmgWoodWall = new HashMap<>();
        dmgWoodWall.put("Explosive 5.56", 5.102040816326531);
        dmgWoodWall.put("Rocket", 166.6666666666667);
        dmgWoodWall.put("C4", 250.0);
        dmgWoodWall.put("Satchel", 83.33333333333333);
        dmgWoodWall.put("F1 Grenade", 4.23728813559322);
        dmgWoodWall.put("Beancan Grenade", 19.23076923076923);
        dmgWoodWall.put("High Velocity Rocket", 27.77777777777778);
        dmgWoodWall.put("40mm HE Grenade", 31.25);
        dmgWoodWall.put("MLRS Rocket", 250.0);

        // Data of damage towards Stone High Walls
        dmgStoneWall = new HashMap<>();
        dmgStoneWall.put("Explosive 5.56", 2.702702702702703);
        dmgStoneWall.put("Rocket", 125.0);
        dmgStoneWall.put("C4", 250.0);
        dmgStoneWall.put("Satchel", 50.0);
        dmgStoneWall.put("F1 Grenade", 2.747252747252747);
        dmgStoneWall.put("Beancan Grenade", 10.8695652173913);
        dmgStoneWall.put("High Velocity Rocket", 15.625);
        dmgStoneWall.put("40mm HE Grenade", 17.24137931034483);
        dmgStoneWall.put("MLRS Rocket", 166.6666666666667);

        // Data of damage towards Wood High Gates
        dmgWoodGate = new HashMap<>();
        dmgWoodGate.put("Explosive 5.56", 5.102040816326531);
        dmgWoodGate.put("Rocket", 166.6666666666667);
        dmgWoodGate.put("C4", 250.0);
        dmgWoodGate.put("Satchel", 83.33333333333333);
        dmgWoodGate.put("F1 Grenade", 4.23728813559322);
        dmgWoodGate.put("Beancan Grenade", 19.23076923076923);
        dmgWoodGate.put("High Velocity Rocket", 27.77777777777778);
        dmgWoodGate.put("40mm HE Grenade", 31.25);
        dmgWoodGate.put("MLRS Rocket", 250.0);

        // Data of damage towards Stone High Gates
        dmgStoneGate = new HashMap<>();
        dmgStoneGate.put("Explosive 5.56", 2.702702702702703);
        dmgStoneGate.put("Rocket", 125.0);
        dmgStoneGate.put("C4", 250.0);
        dmgStoneGate.put("Satchel", 50.0);
        dmgStoneGate.put("F1 Grenade", 2.747252747252747);
        dmgStoneGate.put("Beancan Grenade", 10.8695652173913);
        dmgStoneGate.put("High Velocity Rocket", 15.625);
        dmgStoneGate.put("40mm HE Grenade", 17.24137931034483);
        dmgStoneGate.put("MLRS Rocket", 166.6666666666667);

        // Data of damage towards Stone Barricades
        dmgStoneBarricade = new HashMap<>();
        dmgStoneBarricade.put("Explosive 5.56", 9.090909090909091);
        dmgStoneBarricade.put("Rocket", 100.0);
        dmgStoneBarricade.put("C4", 100.0);
        dmgStoneBarricade.put("Satchel", 100.0);
        dmgStoneBarricade.put("F1 Grenade", 8.333333333333333);
        dmgStoneBarricade.put("Beancan Grenade", 25.0);
        dmgStoneBarricade.put("High Velocity Rocket", 50.0);
        dmgStoneBarricade.put("40mm HE Grenade", 50.0);
        dmgStoneBarricade.put("MLRS Rocket", 100.0);

        // Data of damage towards Wooden Covers
        dmgWoodenCover = new HashMap<>();
        dmgWoodenCover.put("Explosive 5.56", 5.454545454545455);
        dmgWoodenCover.put("Rocket", 120.0);
        dmgWoodenCover.put("C4", 120.0);
        dmgWoodenCover.put("Satchel", 120.0);
        dmgWoodenCover.put("F1 Grenade", 4.137931034482759);
        dmgWoodenCover.put("Beancan Grenade", 17.14285714285714);
        dmgWoodenCover.put("High Velocity Rocket", 30.0);
        dmgWoodenCover.put("40mm HE Grenade", 30.0);
        dmgWoodenCover.put("MLRS Rocket", 120.0);

        // Data of damage towards Sandbag Barricades
        dmgSandbag = new HashMap<>();
        dmgSandbag.put("Explosive 5.56", 9.090909090909091);
        dmgSandbag.put("Rocket", 200.0);
        dmgSandbag.put("C4", 200.0);
        dmgSandbag.put("Satchel", 200.0);
        dmgSandbag.put("F1 Grenade", 8.695652173913043);
        dmgSandbag.put("Beancan Grenade", 25.0);
        dmgSandbag.put("High Velocity Rocket", 50.0);
        dmgSandbag.put("40mm HE Grenade", 50.0);
        dmgSandbag.put("MLRS Rocket", 200.0);

        // Data of damage towards Wooden Barricades
        dmgWoodBarricade = new HashMap<>();
        dmgWoodBarricade.put("Explosive 5.56", 11.36363636363636);
        dmgWoodBarricade.put("Rocket", 250.0);
        dmgWoodBarricade.put("C4", 250.0);
        dmgWoodBarricade.put("Satchel", 250.0);
        dmgWoodBarricade.put("F1 Grenade", 50.0);
        dmgWoodBarricade.put("Beancan Grenade", 62.5);
        dmgWoodBarricade.put("High Velocity Rocket", 50.0);
        dmgWoodBarricade.put("40mm HE Grenade", 62.5);
        dmgWoodBarricade.put("MLRS Rocket", 250.0);

        // Data of damage towards Barbed Wooden Barricades
        dmgBarbedWood = new HashMap<>();
        dmgBarbedWood.put("Explosive 5.56", 11.42857142857143);
        dmgBarbedWood.put("Rocket", 400.0);
        dmgBarbedWood.put("C4", 400.0);
        dmgBarbedWood.put("Satchel", 400.0);
        dmgBarbedWood.put("F1 Grenade", 57.14285714285714);
        dmgBarbedWood.put("Beancan Grenade", 66.66666666666667);
        dmgBarbedWood.put("High Velocity Rocket", 57.14285714285714);
        dmgBarbedWood.put("40mm HE Grenade", 80.0);
        dmgBarbedWood.put("MLRS Rocket", 400.0);

        // Data of damage towards Concrete Barricades
        dmgConcrete = new HashMap<>();
        dmgConcrete.put("Explosive 5.56", 9.433962264150943);
        dmgConcrete.put("Rocket", 250.0);
        dmgConcrete.put("C4", 500.0);
        dmgConcrete.put("Satchel", 250.0);
        dmgConcrete.put("F1 Grenade", 8.620689655172414);
        dmgConcrete.put("Beancan Grenade", 26.31578947368421);
        dmgConcrete.put("High Velocity Rocket", 50.0);
        dmgConcrete.put("40mm HE Grenade", 50.0);
        dmgConcrete.put("MLRS Rocket", 500.0);

        // Data of damage towards Metal Barricades
        dmgMetalBarricade = new HashMap<>();
        dmgMetalBarricade.put("Explosive 5.56", 5.405405405405405);
        dmgMetalBarricade.put("Rocket", 200.0);
        dmgMetalBarricade.put("C4", 600.0);
        dmgMetalBarricade.put("Satchel", 150.0);
        dmgMetalBarricade.put("F1 Grenade", 1.749271137026239);
        dmgMetalBarricade.put("Beancan Grenade", 15.78947368421053);
        dmgMetalBarricade.put("High Velocity Rocket", 30.0);
        dmgMetalBarricade.put("40mm HE Grenade", 35.29411764705882);
        dmgMetalBarricade.put("MLRS Rocket", 300.0);

        // Data of damage towards Triangle Ladder Hatch
        dmgTriangleHatch = new HashMap<>();
        dmgTriangleHatch.put("Explosive 5.56", 3.968253968253968);
        dmgTriangleHatch.put("Rocket", 125.0);
        dmgTriangleHatch.put("C4", 250.0);
        dmgTriangleHatch.put("Satchel", 62.5);
        dmgTriangleHatch.put("F1 Grenade", 5.0);
        dmgTriangleHatch.put("Beancan Grenade", 13.88888888888889);
        dmgTriangleHatch.put("High Velocity Rocket", 22.72727272727273);
        dmgTriangleHatch.put("40mm HE Grenade", 27.77777777777778);
        dmgTriangleHatch.put("MLRS Rocket", 250.0);

        // Data of damage towards Square Ladder Hatch
        dmgSquareHatch = new HashMap<>();
        dmgSquareHatch.put("Explosive 5.56", 3.968253968253968);
        dmgSquareHatch.put("Rocket", 125.0);
        dmgSquareHatch.put("C4", 250.0);
        dmgSquareHatch.put("Satchel", 62.5);
        dmgSquareHatch.put("F1 Grenade", 5.0);
        dmgSquareHatch.put("Beancan Grenade", 13.88888888888889);
        dmgSquareHatch.put("High Velocity Rocket", 22.72727272727273);
        dmgSquareHatch.put("40mm HE Grenade", 27.77777777777778);
        dmgSquareHatch.put("MLRS Rocket", 250.0);

        // Data of damage towards Drop Boxes
        dmgDropBox = new HashMap<>();
        dmgDropBox.put("Explosive 5.56", 2.857142857142857);
        dmgDropBox.put("Rocket", 100.0);
        dmgDropBox.put("C4", 100.0);
        dmgDropBox.put("Satchel", 50.0);
        dmgDropBox.put("F1 Grenade", 1.724137931034483);
        dmgDropBox.put("Beancan Grenade", 8.333333333333333);
        dmgDropBox.put("High Velocity Rocket", 14.28571428571429);
        dmgDropBox.put("40mm HE Grenade", 16.66666666666667);
        dmgDropBox.put("MLRS Rocket", 100.0);

        // Data of damage towards Small Boxes
        dmgSmallBox = new HashMap<>();
        dmgSmallBox.put("Explosive 5.56", 8.823529411764706);
        dmgSmallBox.put("Rocket", 150.0);
        dmgSmallBox.put("C4", 150.0);
        dmgSmallBox.put("Satchel", 150.0);
        dmgSmallBox.put("F1 Grenade", 75.0);
        dmgSmallBox.put("Beancan Grenade", 50.0);
        dmgSmallBox.put("High Velocity Rocket", 150.0);
        dmgSmallBox.put("40mm HE Grenade", 50.0);
        dmgSmallBox.put("MLRS Rocket", 150.0);

        // Data of damage towards Fridges
        dmgFridge = new HashMap<>();
        dmgFridge.put("Explosive 5.56", 8.695652173913043);
        dmgFridge.put("Rocket", 200.0);
        dmgFridge.put("C4", 200.0);
        dmgFridge.put("Satchel", 200.0);
        dmgFridge.put("F1 Grenade", 66.66666666666667);
        dmgFridge.put("Beancan Grenade", 50.0);
        dmgFridge.put("High Velocity Rocket", 100.0);
        dmgFridge.put("40mm HE Grenade", 50.0);
        dmgFridge.put("MLRS Rocket", 200.0);

        // Data of damage towards Large Boxes
        dmgLargeBox = new HashMap<>();
        dmgLargeBox.put("Explosive 5.56", 8.823529411764706);
        dmgLargeBox.put("Rocket", 300.0);
        dmgLargeBox.put("C4", 300.0);
        dmgLargeBox.put("Satchel", 300.0);
        dmgLargeBox.put("F1 Grenade", 75.0);
        dmgLargeBox.put("Beancan Grenade", 60.0);
        dmgLargeBox.put("High Velocity Rocket", 150.0);
        dmgLargeBox.put("40mm HE Grenade", 60.0);
        dmgLargeBox.put("MLRS Rocket", 300.0);

        // Data of damage towards Lockers
        dmgLocker = new HashMap<>();
        dmgLocker.put("Explosive 5.56", 8.928571428571429);
        dmgLocker.put("Rocket", 250.0);
        dmgLocker.put("C4", 500.0);
        dmgLocker.put("Satchel", 500.0);
        dmgLocker.put("F1 Grenade", 71.42857142857143);
        dmgLocker.put("Beancan Grenade", 62.5);
        dmgLocker.put("High Velocity Rocket", 166.6666666666667);
        dmgLocker.put("40mm HE Grenade", 62.5);
        dmgLocker.put("MLRS Rocket", 250.0);

        // Data of damage towards Vending Machines
        dmgVendingMachine = new HashMap<>();
        dmgVendingMachine.put("Explosive 5.56", 2.50501002004008);
        dmgVendingMachine.put("Rocket", 125.0);
        dmgVendingMachine.put("C4", 416.6666666666667);
        dmgVendingMachine.put("Satchel", 83.33333333333333);
        dmgVendingMachine.put("F1 Grenade", 1.007252215954875);
        dmgVendingMachine.put("Beancan Grenade", 8.992805755395683);
        dmgVendingMachine.put("High Velocity Rocket", 14.88095238095238);
        dmgVendingMachine.put("40mm HE Grenade", 17.85714285714286);
        dmgVendingMachine.put("MLRS Rocket", 156.25);

        // Data of damage towards Fences
        dmgFence = new HashMap<>();
        dmgFence.put("Explosive 5.56", 5.0);
        dmgFence.put("Rocket", 100.0);
        dmgFence.put("C4", 100.0);
        dmgFence.put("Satchel", 50.0);
        dmgFence.put("F1 Grenade", 5.0);
        dmgFence.put("Beancan Grenade", 16.66666666666667);
        dmgFence.put("High Velocity Rocket", 25.0);
        dmgFence.put("40mm HE Grenade", 33.33333333333333);
        dmgFence.put("MLRS Rocket", 100.0);

        // Data of damage towards Gates
        dmgGate = new HashMap<>();
        dmgGate.put("Explosive 5.56", 5.0);
        dmgGate.put("Rocket", 75.0);
        dmgGate.put("C4", 75.0);
        dmgGate.put("Satchel", 75.0);
        dmgGate.put("F1 Grenade", 5.0);
        dmgGate.put("Beancan Grenade", 15.0);
        dmgGate.put("High Velocity Rocket", 25.0);
        dmgGate.put("40mm HE Grenade", 25.0);
        dmgGate.put("MLRS Rocket", 75.0);

        // Data of costs of sulfur to make a single tool listed.
        sulfurCosts = new HashMap<>();
        sulfurCosts.put("Explosive 5.56", 25.0);
        sulfurCosts.put("Rocket", 1400.0);
        sulfurCosts.put("C4", 2200.0);
        sulfurCosts.put("Satchel", 480.0);
        sulfurCosts.put("F1 Grenade", 60.0);
        sulfurCosts.put("Beancan Grenade", 120.0);
        sulfurCosts.put("High Velocity Rocket", 200.0);

        // Health data of the deployables.
        deployables = new HashMap<>();
        deployables.put("Wooden Bars", 250.0);
        deployables.put("Strengthened Glass", 350.0);
        deployables.put("Metal Bars", 500.0);
        deployables.put("Reinforced Glass", 500.0);
        deployables.put("Wood Door", 200.0);
        deployables.put("Metal Door", 250.0);
        deployables.put("Armor Door", 800.0);
        deployables.put("Garage Door", 600.0);
        deployables.put("High Wooden Wall", 500.0);
        deployables.put("High Stone Wall", 500.0);
        deployables.put("Wood Gate", 500.0);
        deployables.put("Stone Gate", 500.0);
        deployables.put("Stone Barricade", 100.0);
        deployables.put("Wooden Cover", 120.0);
        deployables.put("Sandbag", 200.0);
        deployables.put("Wood Barricade", 250.0);
        deployables.put("Barbed Wood Barricade", 400.0);
        deployables.put("Concrete Barricade", 500.0);
        deployables.put("Metal Barricade", 600.0);
        deployables.put("Triangle Hatch", 250.0);
        deployables.put("Square Hatch", 250.0);
        deployables.put("Drop Box", 100.0);
        deployables.put("Small Box", 150.0);
        deployables.put("Fridge", 200.0);
        deployables.put("Large Box", 300.0);
        deployables.put("Locker", 500.0);
        deployables.put("Vending Machine", 1250.0);
        deployables.put("Fence", 100.0);
        deployables.put("Gate", 75.0);

        // Health data of the building blocks.
        buildingBlocks = new HashMap<>();
        buildingBlocks.put("Twig", 10.0);
        buildingBlocks.put("Wood", 250.0);
        buildingBlocks.put("Stone", 500.0);
        buildingBlocks.put("Metal", 1000.0);
        buildingBlocks.put("Armor", 2000.0);

        // Data of damage towards Twig structures
        dmgTwig = new HashMap<>();
        dmgTwig.put("Explosive 5.56", 5.0);
        dmgTwig.put("Rocket", 10.0);
        dmgTwig.put("C4", 10.0);
        dmgTwig.put("Satchel", 10.0);
        dmgTwig.put("F1 Grenade", 10.0);
        dmgTwig.put("Beancan Grenade", 10.0);
        dmgTwig.put("High Velocity Rocket", 10.0);
        dmgTwig.put("40mm HE Grenade", 10.0);
        dmgTwig.put("MLRS Rocket", 10.0);

        // Data of damage towards Wooden structures
        dmgWood = new HashMap<>();
        dmgWood.put("Explosive 5.56", 5.102040816);
        dmgWood.put("Rocket", 125.0);
        dmgWood.put("C4", 250.0);
        dmgWood.put("Satchel", 83.3334);
        dmgWood.put("F1 Grenade", 4.237288136);
        dmgWood.put("Beancan Grenade", 19.23076923);
        dmgWood.put("High Velocity Rocket", 27.77777778);
        dmgWood.put("40mm HE Grenade", 31.25);
        dmgWood.put("MLRS Rocket", 250.0);

        // Data of damage towards Stone structures
        dmgStone = new HashMap<>();
        dmgStone.put("Explosive 5.56", 2.702702703);
        dmgStone.put("Rocket", 125.0);
        dmgStone.put("C4", 250.0);
        dmgStone.put("Satchel", 50.0);
        dmgStone.put("F1 Grenade", 2.747252747);
        dmgStone.put("Beancan Grenade", 10.86956522);
        dmgStone.put("High Velocity Rocket", 15.625);
        dmgStone.put("40mm HE Grenade", 17.24137931);
        dmgStone.put("MLRS Rocket", 166.6666667);

        // Data of damage towards Metal structures
        dmgMetal = new HashMap<>();
        dmgMetal.put("Explosive 5.56", 2.169197397);
        dmgMetal.put("Rocket", 125.0);
        dmgMetal.put("C4", 250.0);
        dmgMetal.put("Satchel", 43.47826087);
        dmgMetal.put("F1 Grenade", 1.007049345);
        dmgMetal.put("Beancan Grenade", 8.928571429);
        dmgMetal.put("High Velocity Rocket", 14.92537313);
        dmgMetal.put("40mm HE Grenade", 17.54385965);
        dmgMetal.put("MLRS Rocket", 166.6666667);

        // Data of damage towards Armored structures
        dmgArmor = new HashMap<>();
        dmgArmor.put("Explosive 5.56", 2.503128911);
        dmgArmor.put("Rocket", 133.3333333);
        dmgArmor.put("C4", 250.0);
        dmgArmor.put("Satchel", 43.47826087);
        dmgArmor.put("F1 Grenade", 1.007049345);
        dmgArmor.put("Beancan Grenade", 8.968609865);
        dmgArmor.put("High Velocity Rocket", 14.92537313);
        dmgArmor.put("40mm HE Grenade", 17.54385965);
        dmgArmor.put("MLRS Rocket", 166.6666667);

    }
}
