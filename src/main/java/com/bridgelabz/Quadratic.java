package com.bridgelabz;

/**
 * Java program  to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots.
 * The 2 roots of the equation can be found using a formula
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a)
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 * Take a, b and c as input values to find the roots of x.
 *
 * @Date - 02/06/2021
 * @author Deepak Jaiswal
 */

public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        /** delta = b*b - 4*a*c **/

        double discriminant = b*b - 4.0*c;
        double sqroot =  Math.sqrt(discriminant);

        /**Root 1 of x = (-b + sqrt(delta))/(2*a)
        //Root 2 of x = (-b - sqrt(delta))/(2*a) */

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        /**Print the result
        //@result */

        System.out.println(root1);
        System.out.println(root2);
    }

}
