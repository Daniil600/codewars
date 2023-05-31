package org.example;

/**
 *  (including when it's falling and bouncing?)
 * @Param:
 * @Float parameter "h" in meters must be greater than 0
 * @Float parameter "bounce" must be greater than 0 and less than 1
 * @Float parameter "window" must be less than h.
 * @If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
 */
public class BouncingBalls {
    static int count = 0;

            /**
             *     This is a method for checking the correctness of the entered data,
             *      if everything is correct, then it launches the method {@link #calc}
             * */

    public static int bouncingBall(double h, double bounce, double window) {
        if (h < window || bounce < 0 || window < 0 || bounce > 1) {
            return -1;
        }
        else {
            calc(h, bounce, window);
            return count;
        }
    }

    //It's method calculate result
    private static void calc(double h, double bounce, double window){
        h = h * bounce;
        if(h > window){
            count+=2;
        }
        if(h < window){
            count++;
            return;
        }
        calc(h, bounce, window);
    }
}
