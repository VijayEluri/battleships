package com.oocode;

public class PossibilitiesToLeft extends Possibilities {
    PossibilitiesToLeft(PossibleGuesses possibleGuesses) {
        super(possibleGuesses);
    }

    public static PossibilitiesToLeft toLeftCanBe(PossibleGuesses possibleGuessesAbove) {
        return new PossibilitiesToLeft(possibleGuessesAbove);
    }
}
