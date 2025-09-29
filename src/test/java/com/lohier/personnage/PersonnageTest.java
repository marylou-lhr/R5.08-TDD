package com.lohier.personnage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PersonnageTest {

    Personnage personnage = new Personnage();

    @Test
    void devrait_retourner_EST() throws Exception {
        //GIVEN
        int nbFois = 3;
        String resultAttendu = "OUEST";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_NORD() throws Exception {
        //GIVEN
        int nbFois = 4;
        String resultAttendu = "NORD";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_orientation_inchangee() throws Exception {
        //GIVEN
        int nbFois = 0;
        String resultAttendu = personnage.getOrientation();

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_une_exception_pour_val_negative() throws Exception {
        //GIVEN
        int nbFois = -1;
        String resultAttendu = "Une valeur négative n'est pas autorisée.";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_SUD() throws Exception {
        //GIVEN
        personnage.setOrientation("EST");
        int nbFois = 1;
        String resultAttendu = "SUD";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_orientation_inchangee_EST() throws Exception {
        //GIVEN
        personnage.setOrientation("EST");
        int nbFois = 4;
        String resultAttendu = personnage.getOrientation();

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @Test
    void devrait_retourner_une_exception_pour_orient_invalide() throws Exception {
        //GIVEN
        personnage.setOrientation("abc");
        int nbFois = 4;
        String resultAttendu = "Orientation invalide";

        //WHEN
        String resultat = personnage.tourner(nbFois);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }
}
