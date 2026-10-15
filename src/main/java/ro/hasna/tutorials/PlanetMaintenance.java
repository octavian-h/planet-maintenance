package ro.hasna.tutorials;

import java.util.ArrayList;
import java.util.List;

public class PlanetMaintenance {

    static void main() {
        morningRoutine().forEach(System.out::println);
    }

    static List<String> morningRoutine() {
        List<String> actions = new ArrayList<>();
        boolean volcano1Active = true;
        boolean volcano2Active = true;
        boolean volcano3Active = false; // extinct, but "you never know"

        if (volcano1Active) {
            actions.add("Sweeping volcano 1 (active)");
        } else {
            actions.add("Sweeping volcano 1 (extinct)");
        }
        if (volcano2Active) {
            actions.add("Sweeping volcano 2 (active)");
        } else {
            actions.add("Sweeping volcano 2 (extinct)");
        }
        if (volcano3Active) {
            actions.add("Sweeping volcano 3 (active)");
        } else {
            actions.add("Sweeping volcano 3 (extinct)");
        }

        List<String[]> sprouts = List.of(
                new String[]{"pointy", "strong", "tall"},
                new String[]{"round", "sweet", "short"});

        for (String[] sprout : sprouts) {
            boolean baobab;
            if (sprout[0].equals("pointy")) {
                if (sprout[1].equals("strong")) {
                    if (sprout[2].equals("tall")) {
                        baobab = true;
                    } else {
                        baobab = false;
                    }
                } else {
                    baobab = false;
                }
            } else {
                baobab = false;
            }
            if (baobab) {
                actions.add("Pulling up a baobab sprout!");
            }
        }

        actions.add("Watering the rose");
        actions.add("Putting the glass globe over the rose");
        return actions;
    }
}
