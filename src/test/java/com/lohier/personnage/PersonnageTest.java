package com.lohier.personnage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PersonnageTest {

    Personnage personnage = new Personnage();

    @Test
    void devrait_retourner_EST()
    {
        //GIVEN
        int nbFois = 3;
        String resultAttendu = "OUEST";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_NORD()
    {
        //GIVEN
        int nbFois = 4;
        String resultAttendu = "NORD";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_orientation_inchangee()
    {
        //GIVEN
        int nbFois = 0;
        String resultAttendu = personnage.getOrientation();

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

}
