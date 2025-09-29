package com.lohier.facteursPremiersTest;

import com.lohier.facteursPremiers.FacteursPremiers;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class FacteursPremiersTest {

    FacteursPremiers facteursPremiers = new FacteursPremiers();
    @Test
    void devrait_renvoyer_une_liste_vide()
    {
        //GIVEN
        int nb1 = 0;
        int nb2 = 1;
        Set<Integer> resultAttendu = new HashSet<>();


        //WHEN
        Set<Integer> result1 = facteursPremiers.generate(nb1);
        Set<Integer> result2 = facteursPremiers.generate(nb2);

        //THEN
        assertThat(result1).isEqualTo(resultAttendu);
        assertThat(result2).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_renvoyer_une_liste_avec_seulement_deux()
    {
        //GIVEN
        int nb = 2;
        Set<Integer> resultAttendu = new HashSet<>();
        resultAttendu.add(2);

        //WHEN
        Set<Integer> result = facteursPremiers.generate(nb);

        //THEN
        assertThat(result).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_renvoyer_une_liste_valide()
    {
        //GIVEN
        int nb = 6;
        Set<Integer> resultAttendu = new HashSet<>();
        resultAttendu.add(2);
        resultAttendu.add(3);

        //WHEN
        Set<Integer> result = facteursPremiers.generate(nb);

        //THEN
        assertThat(result).isEqualTo(resultAttendu);
    }
}
