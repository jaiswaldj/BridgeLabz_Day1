package com.bridgelabz;


/**
 * Java program takes two integer command-line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 * formulae to calculate distance = sqrt(x*x + y*y).
 *
 * Prints the distance from (x, y) to the origin, where x and y
 *   are integers
 *
 * @Date 02/06/2021
 * @author Deepak Jaiswal
 */

public class Distance {
    public static void main(String[] args) {

        /** parse x- and y-coordinates from command-line arguments */

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        /**compute distance to (0, 0) */

        double dist = Math.sqrt(x*x + y*y);

        /** output distance */

        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }


}
