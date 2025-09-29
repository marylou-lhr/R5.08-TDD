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

        String tourner(int pNbFois) throws Exception {
            if (pNbFois >= 0)
            {
                ArrayList<String> orientations = new ArrayList<>();

                orientations.add("NORD");
                orientations.add("EST");
                orientations.add("SUD");
                orientations.add("OUEST");

                switch (orientation)
                {
                    case "NORD":
                        break;
                    case "EST":
                        pNbFois = pNbFois + 1;
                        break;
                    case "SUD":
                        pNbFois = pNbFois + 2;
                        break;
                    case "OUEST":
                        pNbFois = pNbFois + 3;
                        break;
                    default:
                        throw new Exception("Orientation invalide");
                }

                pNbFois = pNbFois % 4;

                return orientations.get(pNbFois);
            }
            else
            {
                return "Une valeur négative n'est pas autorisée.";
            }
        }
}
