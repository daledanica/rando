package com.danicadale.rando;

/**
 * This class is a container for a random number. This is needed by SpringBoot, via Jackson, to
 * generate a JSON response payload
 *
 * @author Danica Dale
 * @since February 2022
 */
public class RandomNumber {

    private final int random;



    /**
     * Constructor for the random number container
     * @param random the random number to contain.
     */
    public RandomNumber(int random) {

        this.random = random;
    }



    // IntelliJ and code smell sniffers will complain that this is not used. However, SpringBoot,
    // via Jackson, needs this to serialize a JSON response payload.
    public int getRandom() {

        return random;
    }
}
