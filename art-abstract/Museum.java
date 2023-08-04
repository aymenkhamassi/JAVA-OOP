package com.aymen.art;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art>();

        // Create 3 instances of Painting
        Painting painting1 = new Painting("Starry Night", "Vincent van Gogh",
                "A famous oil painting depicting a night sky with swirling stars.", "Oil");
        museum.add(painting1);

        Painting painting2 = new Painting("Mona Lisa", "Leonardo da Vinci",
                "An iconic portrait of a woman with an enigmatic smile.", "Oil");
        museum.add(painting2);

        Painting painting3 = new Painting("Water Lilies", "Claude Monet",
                "A series of paintings featuring water lilies and their reflections.", "Watercolor");
        museum.add(painting3);

        // Create 2 instances of Sculpture
        Sculpture sculpture1 = new Sculpture("David", "Michelangelo",
                "A famous sculpture of a biblical hero.", "Marble");
        museum.add(sculpture1);

        Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin",
                "A bronze sculpture of a man deep in thought.", "Bronze");
        museum.add(sculpture2);

        // Shuffle and print the information for each artwork in the museum
        Collections.shuffle(museum);
        for (Art artwork : museum) {
            artwork.viewArt();
            System.out.println("---------------------------");
        }
    }
}
