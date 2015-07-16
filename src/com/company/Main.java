package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello intelliJ");
        GridGeneration gg=new GridGeneration();
        gg.generateGrid();
//        System.out.println("gridX: " + gg.getGridX());
//        System.out.println("gridY: " + gg.getGridY());
        System.out.print("Give number of rovers you want: ");
        Scanner input=new Scanner(System.in);
        int noOfRovers=input.nextInt();
        Rover[] r=new Rover[noOfRovers];
        for (int i=0;i<noOfRovers;i++){
            r[i]=new Rover();
            r[i].setGridGeneration(gg);
            r[i].roverInit();
            r[i].moveRover();
            System.out.print(r[i].getRoverX());
            System.out.print(r[i].getRoverY());
            System.out.println(r[i].getRoverDirection());
        }
    }
}
