package isp.lab3.exercise1;

import isp.lab3.exercise3.Vehicle;

public class Tree {
    private int  height;
    public  Tree()
    {
        this.height=15;
    }
    public void grow(int meters)
    {
        if(meters >=1)
        {
            this.height+=meters;
        }
    }
    public String toString() {
        return "Tree height: " + height;
    }
    public static void main(String[] args) {

            Tree myTree = new Tree();
        System.out.println("Initial tree height: "+myTree.toString());
        myTree.grow(5);
        System.out.println("Updated tree height: "+myTree.toString());


    }
}

