package asprak.mod14.modul14;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Color> favoriteColors = new HashMap<>();

        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.GRAY);

        // Output pasangan Key - Value
        Set<String> keySets = favoriteColors.keySet();

        for (String key : keySets) {
            Color color = favoriteColors.get(key);
            System.out.println(key + " : " + color);
        }
        // Output pasangan Key - Value
    }
}
