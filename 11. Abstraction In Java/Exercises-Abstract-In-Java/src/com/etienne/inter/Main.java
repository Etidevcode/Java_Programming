package com.etienne.inter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Tim", 10, 15);
        System.out.println(player.toString());
        saveObject(player);

        player.setHitPoints(8);
        System.out.println(player);
        player.setWeapon("Stormbringer");
        saveObject(player);
        //loadObject(player);
        //System.out.println(player);

        Monster werewolf = new Monster("Werewolf", 20, 40);
        saveObject(werewolf);
    }

        public static List<String> readValues() {
            List<String> values = new ArrayList<>();

            values.add("John");
            values.add("300");
            values.add("50");

            return values;
        }

        public static void saveObject(ISaveable objectToSave) {
            for (int i = 0; i < objectToSave.write().size(); i++) {
                System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
            }
        }

        public static void loadObject(ISaveable objectToLoad) {
            List<String> values = readValues();
            objectToLoad.read(values);
    }
}
