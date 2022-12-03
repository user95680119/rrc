package com.example.rrc;

import java.util.*;

// Stripped down code from the cli-interface version for the GUI.

public class RustCalculator {

    // Uses a queue to hold the structures that will be calculated.
    public static Queue<String> blockQueue = new LinkedList<>();

    public static void main(String[] args) {
        Data.reset();
        // Resets data to make sure no overlapping calculations occur.
    }

    // Adds blocks to the queue by using the parameters to sort the items from each other.
    public static void blockQueueAdd(String tier, int amount) {
        // Loops the same amount of times as the user requested the amount of added blocks.
        for (int i = 0; i < amount; i++) {
            blockQueue.add(tier + " block");
        }
        System.out.println("Successfully added " + amount + " " + tier + " blocks to the queue!");
    }

    // Adds deployables to the queue by using the parameters to sort the items from each other.
    public static void deployableQueueAdd(String type, int amount) {
        // Loops the same amount of times as the user requested the amount of added deployables.
        for (int i = 0; i < amount; i++) {
            blockQueue.add(type + " deployable");
        }
        System.out.println("Successfully added " + amount + " " + type + " deployables to the queue!");
    }

    // Clears the queue where the deployables and blocks are stored before calculation.
    public static void clearQueue() {
        // Tests if the queue is empty already and prints a message to console if so.
        if (blockQueue.isEmpty()) {
            System.out.println("The queue is already empty.");
        }
        while (!blockQueue.isEmpty()) {
            // Removes each element while the queue is not empty yet.
            blockQueue.remove();
        }
        System.out.println("The queue has been cleared.");
        // After the queue is cleared, a message is outputted to the console for confirmation.
    }
}
