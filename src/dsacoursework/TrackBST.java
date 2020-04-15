/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;

/**
 *
 * @author Javier Alcántara García
 */
public class TrackBST {
    BinarySearchTree<Track> myTrackBST = new BinarySearchTree();
    
    TrackBST() {
        loadData();
    }
    
    /** Loads a file containing a number of Tracks into a BinarySearchTree.
    */
    public void loadData() {
        String data = "";
        String[] elements;
        try {
            File myObj = new File("../dsaCoursework/src/dsaCoursework/trackInput");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                elements = data.split(",");
                myTrackBST.add(new Track(elements[0],elements[1],elements[2],elements[3],elements[4],elements[5],elements[6],elements[7]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred inserting." + data);
            e.printStackTrace();
        }
    }
    
}
