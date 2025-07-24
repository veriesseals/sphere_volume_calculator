/* 
Given sphereRadius and piVal, compute the volume of a sphere and assign sphereVolume with the result. Use (4.0 / 3.0) to perform floating-point division, instead of (4 / 3) which performs integer division.

Volume of sphere = (4.0 / 3.0) π r3 (Hint: r3 can be computed using *)
*/


import java.util.Scanner;

public class SphereVolumeCalculator {

    public static void main(String[] args) {
        try(Scanner scnr = new Scanner(System.in);){
            double piVal = 3.14159;
            double sphereVolume;
            double sphereRadius;

            sphereRadius = scnr.nextDouble();

            /* Your solution goes here  */
            // ---------------------------------------------------
            sphereVolume = (4.0 / 3.0) * piVal * sphereRadius * sphereRadius * sphereRadius;

            System.out.println(sphereVolume);

        }
    }
}
