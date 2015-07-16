package com.company;

import java.util.Scanner;

/**
 * Created by bairamsa on 7/16/15.
 */
public class GridGeneration {
    public int gridX;
    public int gridY;
    public void generateGrid(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Grid coordinates(space to separate): ");
        gridX=input.nextInt();
        gridY=input.nextInt();
    }

    public int getGridX(){
        return gridX;
    }

    public int getGridY() {
        return gridY;
    }
}
