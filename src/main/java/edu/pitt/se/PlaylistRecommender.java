package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        Integer bpmList = 0;

        try {
            if(bpms == null || bpms.size() == 0) {
                throw new IllegalArgumentException("bpms list cannot be null or empty");
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }

        for (Integer integer : bpms) 
        {
            bpmList += integer;
        }
        bpmList = bpmList / bpms.size();
        
        if(bpmList >= 140)
        {
            return "HIGH";
        } 
        else if(bpmList >= 100)
        {
            return "MEDIUM";
        } 
        else
        {
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        for (char c : title.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        if(volumeDb < 0){
            volumeDb = 0;
        }
        else if(volumeDb > 100){
            volumeDb = 100;
        }
        return volumeDb;
    }
}
