package com.lohier.arabicRomanNumerals;

public class ArabicRomanNumerals {

    public
        String convert(int pNb)
        {
            StringBuilder num_romains = new StringBuilder();

            if (pNb <= 0 || pNb > 50)
            {
                return "Erreur : Le nombre entré doit être entre 1 et 50.";
            }

            if (pNb - 50 == 0)
            {
                num_romains.append("L");

                pNb -= 50;
            }
            if (pNb == 49)
            {
                num_romains.append("IL");

                pNb -= 49;
            }
            while (pNb - 10 >= 0)
            {
                num_romains.append("X");

                pNb -= 10;
            }
            if (pNb == 9)
            {
                num_romains.append("IX");
                pNb -= 9;
            }
            while (pNb - 5 >= 0)
            {
                num_romains.append("V");

                pNb -= 5;
            }
            if (pNb == 4)
            {
                num_romains.append("IV");
            }
            else
            {
                while (pNb - 1 >= 0)
                {
                    num_romains.append("I");

                    pNb--;
                }
            }

            return num_romains.toString();
        }
}
