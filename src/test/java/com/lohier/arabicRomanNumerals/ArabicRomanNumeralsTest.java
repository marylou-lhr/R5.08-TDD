package com.lohier.arabicRomanNumerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {

    ArabicRomanNumerals arabicRomanNumerals = new ArabicRomanNumerals();

    @ParameterizedTest(name = "Test cas nominaux #{index} - {0} => {1}")
    @CsvSource({"1,I", "3, III", "4, IV", "5, V", "6, VI", "10, X", "39, XXXIX", "49, IL"})
    void devrait_retourner_un_resultat_juste(int pNb, String resultAttendu)
    {
        //WHEN
        String resultat = arabicRomanNumerals.convert(pNb);

        //THEN
        assertThat(resultat).isEqualTo(resultAttendu);
    }

    @ParameterizedTest(name = "Test cas exception #{index} - {0} => Erreur")
    @CsvSource({"0, Erreur : Le nombre entré doit être entre 1 et 50.", "-1, Erreur : Le nombre entré doit être entre 1 et 50.", "51, Erreur : Le nombre entré doit être entre 1 et 50."})
    void devrait_retourner_une_erreur(int pNb, String resultAttendu)
    {

        //WHEN
        String result = arabicRomanNumerals.convert(pNb);

        //THEN
        assertThat(result).isEqualTo(resultAttendu);
    }
}
