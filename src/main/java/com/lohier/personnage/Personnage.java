package com.lohier.personnage;

import java.util.ArrayList;

public class Personnage {
    private
        String orientation = "NORD";

    public
        String getOrientation() { return orientation; }

        void setOrientation(String newOrientation)
        {
            orientation = newOrientation;
        }

        String tourner(int pNbFois)
        {
            if (pNbFois >= 0)
            {
                ArrayList<String> orientations = new ArrayList<>();

                orientations.add("NORD");
                orientations.add("EST");
                orientations.add("SUD");
                orientations.add("OUEST");

                pNbFois = pNbFois % 4;

                return orientations.get(pNbFois);
            }
            else
            {
                return "Une valeur négative n'est pas autorisée.";
            }
        }
}
