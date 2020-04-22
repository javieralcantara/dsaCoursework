/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import java.io.File;
import java.io.FileNotFoundException; 
import java.util.List;
import java.util.ArrayList;
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
    
    /** Displays the BST in ascending order by Artist. 
     * It makes use of toList() method built in BinarySeatchTree.
    */
    public void displayArtistsAscending() {
        System.out.println(myTrackBST.toList());
    }
    
    /** Displays the BST in descending order by Artist. 
     * It makes use of toList() method built in BinarySeatchTree, reversing the obtained value.
    */
    public void displayArtistsDescending() {
        List<Track> result = myTrackBST.toList();
        int size = result.size();
        List<Track> reversed = new ArrayList<>(size);
        
        for(int i = result.size() -1; i >= 0; i--) {
            reversed.add(result.get(i));
        }
        System.out.println(reversed);
    }
    
    /** Displays the Artist of each element in the BST. 
     * It makes use of toList() method built in BinarySeatchTree.
    */
    public void displayAllArtists() {
        List<Track> myList = myTrackBST.toList();
        int size = myList.size();
        List<String> artists = new ArrayList<>(size);
        
        for(int i = 0; i < myList.size(); i++) {
            artists.add(myList.get(i).getArtist());
        }
        System.out.println(artists);
    }
    
    /** Displays the BST. 
     * It makes use of toList() method built in BinarySeatchTree.
    */
    public void displayAvailableForUse() {
        System.out.println(myTrackBST.toList());
    }
    
    
    
}
