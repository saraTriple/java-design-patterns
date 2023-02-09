package src.Prototype2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Creating Duplicates of colors and storing them
public class ColorStore {
    Map<String, Color> colorMap = new HashMap<>();
    public void duplicate(Color color) {
        // Cloning the colors
        Color newColor = color.clone();

        // Adding the cloned colors to Map
        colorMap.put(newColor.getColorName(), newColor);
    }
}
