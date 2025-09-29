package com.lohier.facteursPremiers;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class FacteursPremiers {
    public Set<Integer> generate(int pNb)
    {
        Set<Integer> liste = new HashSet<>();
        while (pNb % 2 == 0) {
            liste.add(2);
            pNb /= 2;
        }
        for (int i = 3; i < round(sqrt(pNb)); i+=2) {
            while (pNb % i == 0)
            {
                liste.add(i);
                pNb /= i;
            }
        }
        if (pNb > 2) {
            liste.add(pNb);
        }

        return liste;
    }
}
