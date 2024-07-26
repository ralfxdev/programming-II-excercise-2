package umg.pgm2;

import umg.pgm2.group1.clsAreaCircle;
import umg.pgm2.group1.clsCircumferenceCircle;
import umg.pgm2.group1.clsVolumeCube;
import umg.pgm2.group2.clsAreaPyramid;
import umg.pgm2.group2.clsAreaTriangle;
import umg.pgm2.group2.clsVolumePyramid;
import umg.pgm2.group3.clsVolumePrism;

public class Main {
    public static void main(String[] args) {
        clsAreaPyramid areaPyramid = new clsAreaPyramid();
        clsVolumePrism volumePrism = new clsVolumePrism();
        clsAreaCircle areaCircle = new clsAreaCircle();
        clsCircumferenceCircle circumferenceCircle = new clsCircumferenceCircle();
        clsVolumeCube volumeCube = new clsVolumeCube();
        clsVolumePyramid volumePyramid = new clsVolumePyramid();
        clsAreaTriangle areaTriangle = new clsAreaTriangle();

        System.out.println("areaPyramid");
        System.out.println(areaPyramid.calculateAreaPyramid(4,5,6,5));

        System.out.println("volumePrism");
        System.out.println(volumePrism.calculateVolumePrism(4,5));

        System.out.println("areaCircle");
        System.out.println(areaCircle.calculateAreaCircle(4));

        System.out.println("circumferenceCircle");
        System.out.println(circumferenceCircle.calculateCircumferenceCircle(16));

        System.out.println("volumeCube");
        System.out.println(volumeCube.calculateVolumeCube(20));

        System.out.println("volumePyramid");
        System.out.println(volumePyramid.calculateVolumePyramid(4,5));

        System.out.println("areaTriangle");
        System.out.println(areaTriangle.calculateAreaTriangle(8,12));
    }
}