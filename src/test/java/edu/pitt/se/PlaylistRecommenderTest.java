package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    void testClassifyEnergy() {
        List<Integer> highBPMs = List.of(150, 160, 170);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(highBPMs));
    }
}
