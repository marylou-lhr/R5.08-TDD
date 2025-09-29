package com.lohier.personnage;

import java.util.ArrayList;

public class Personnage {

    public
        String tourner(int pNbFois)
        {
            ArrayList<String> orientations = new ArrayList<>();

            orientations.add("NORD");
            orientations.add("EST");
            orientations.add("SUD");
            orientations.add("OUEST");

            return orientations.get(pNbFois);
        }
}
