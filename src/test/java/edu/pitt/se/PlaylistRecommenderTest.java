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

    @Test
    void testIsValidTrackTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Song Title 123"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("Song@Title!"));
    }

    @Test
    void testNormalizeVolume() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-10));
        assertEquals(100, PlaylistRecommender.normalizeVolume(150));
        assertEquals(50, PlaylistRecommender.normalizeVolume(50));
    }
}