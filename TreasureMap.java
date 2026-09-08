package labtask04;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {

    private Map<String, Double> treasures;

    public TreasureMap() {

        treasures = new HashMap<>();

        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);
    }

    public void updatePalm() {

        double currentPalmValue = treasures.get("palm");

        treasures.put(
                "palm",
                currentPalmValue + treasures.size()
        );
    }

    public double calculateTotal() {

        double total = 0.0;

        for (double value : treasures.values()) {
            total += value;
        }

        return total;
    }

    public Map<String, Double> getTreasures() {
        return new HashMap<>(treasures);
    }

    public static void main(String[] args) {

        TreasureMap map = new TreasureMap();

        System.out.println("Before update:");
        System.out.println(map.treasures);

        map.updatePalm();

        System.out.println("After updating palm:");
        System.out.println(map.treasures);

        System.out.println("Total value: "
                + map.calculateTotal());
    }
}