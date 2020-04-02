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
    BinarySearchTree<String> myTrackBST = new BinarySearchTree();
    
    TrackBST() {
        System.out.println("TrackBST object created");
    }
    
    /** Loads a file containing a number of Tracks into a BinarySearchTree.
    */
    public void loadData() {
        try {
            File myObj = new File("../dsaCoursework/src/dsaCoursework/trackInput");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
