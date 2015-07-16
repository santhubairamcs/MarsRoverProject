package com.company;

import java.util.Scanner;

/**
 * Created by bairamsa on 7/16/15.
 */
public class Rover {
    public int roverX;
    public int roverY;
    public char roverDirection;
    public String actionSting;
    GridGeneration gg;

    public void setGridGeneration(GridGeneration gg){
        this.gg=gg;
    }

    public void setRoverX(int roverX) {
        this.roverX = roverX;
    }
    public void setRoverY(int roverY) {
        this.roverY = roverY;
    }
    public void setRoverDirection(char roverDirection) {
        this.roverDirection = roverDirection;
    }
    public void setActionSting(String actionSting) {
        this.actionSting = actionSting;
    }

    public int getRoverX() {
        return roverX;
    }

    public int getRoverY() {
        return roverY;
    }

    public char getRoverDirection() {
        return roverDirection;
    }

    public void roverInit(){
        Scanner input=new Scanner(System.in);
        System.out.print("Give Rover position(X,Y,DIRECTION(E,W,N,S only)): ");
        setRoverX(input.nextInt());
        setRoverY(input.nextInt());
        setRoverDirection(input.next().charAt(0));
        System.out.print("Give action string( use L,R,M only): ");
        setActionSting(input.next());
    }


    public void moveRover(){
        for(int i=0;i<actionSting.length();i++){
            char action=actionSting.charAt(i);
            if (action=='L'){
                rotateLeft();
            }
            else if(action=='R'){
                rotateRight();
            }
            else if(action=='M'){
                move();
            }
            else
                ;
        }
    }

    public void rotateLeft(){
        if (this.roverDirection=='N' )
            this.roverDirection='W';
        else if (this.roverDirection=='W')
            this.roverDirection='S';
        else if (this.roverDirection=='S')
            this.roverDirection='E';
        else if (this.roverDirection=='E')
            this.roverDirection='N';
        else
            ;
    }

    public void rotateRight(){
        if (this.roverDirection=='N')
            this.roverDirection='E';
        else if (this.roverDirection=='W')
            this.roverDirection='N';
        else if (this.roverDirection=='S')
            this.roverDirection='W';
        else if (this.roverDirection=='E')
            this.roverDirection='S';
        else
            ;
    }

    public void move(){
        if (this.roverDirection=='N' && this.getRoverY()<this.gg.getGridY())
            this.roverY++;
        else if(this.roverDirection=='S' && this.getRoverY()>=0)
            this.roverY--;
        else if(this.roverDirection=='E' && this.getRoverX()<this.gg.getGridX())
            this.roverX++;
        else if(this.roverDirection=='W' && this.getRoverX()>=0)
            this.roverX--;
        else
            ;
    }
}
