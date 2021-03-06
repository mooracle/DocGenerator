package com.teamtreehouse.math;

import com.teamtreehouse.docgen.Doc;

import java.awt.geom.Point2D;

@Doc(
        description = "Utility Class for commonly used math functions"
)
public class MathUtils {
    private static final Double EPSILON = 0.0001;

    @Doc(
            description = "Calculate the area of a triangle",
            parameters = {"Coordinates of the first vertex", "Coordinate of second vertex", "Third vertex"},
            returnVal = "Calculated area of the triangle"
    )
    public static Double triangleArea(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
        return 0.0;
    }

    @Doc(
            description = "Calculate the distance between the given points",
            parameters = {"Coordinates of one point", "Coordinates of another point"},
            returnVal = "shortest distance between 2 points"
    )
    public static Double distance(Point2D.Double a, Point2D.Double b) {
        return 0.0;
    }

    @Doc(
            description = "Calculate quadratic roots of non-linear equation",
            parameters = {"coeff a", "coeff b", "coeff c"},
            returnVal = "root of the equation"
    )
    public static Double[] quadraticRoots(int a, int b, int c) {
        return new Double[]{};
    }

    @Doc(
            description = "Displays the value of epsilon"
    )
    public static void epsilon() {

    }

    private static boolean arePointsClose(Point2D.Double a, Point2D.Double b) {
        return false;
    }
}
