/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import java.util.Scanner;

/**
 *
 * @author Javier Alcántara García
 */
public class DsaCoursework {
    
    public void chooseOption() {        
        String helpMessage = "Data Structures and Algorithms Coursework. Choose from: \"1\", \"2\", \"3\", \"4\", \"5\"";
        Boolean done = false;
        do {
            System.out.println( helpMessage );
            String choice = getMenuChoice();
            switch (choice) {
                case "1": //Track
                    question1();
                    break;
                case "2": //TrackList
                    question2();
                    break;
                case "3": //Trac12kBST
                    question3();
                    break;
                case "4": // display help
                    System.out.println(helpMessage);
                    break;
                case "5": // quit
                    done = true;
                    break;
            }
        } while (! done);

        System.out.println("\nCoursework test ended");
    }
    
    public void question1() {
        System.out.println("Question 1 Building a Track class started");
        testTrackClass();
        System.out.println("Question 1 ended");
    }
    
    public void question2() {
        System.out.println("Question 2 Building a TrackList class started");
        testTrackListClass();
        System.out.println("Question 2 ended");
    }
    
    public void question3() {
        System.out.println("Question 3 Building a Binary Search Tree (BST) of Track data started");
        testTrackBSTClass();
        System.out.println("Question 3 ended");
    }
    
    private void testTrackClass() {
        Track emptyTrack = new Track();
        Track myTrackOne = new Track("654321", "Wow", "Post Malone", "2:30", "Post Malone", "24/12/2018", "Hollywood's Bleeding", "Hip hop");
        Track myTrackTwo = new Track("567890", "Lose Yourself", "Eminem", "5:20", "Eminem", "28/10/2002", "Curtain Call", "Hip hop");
        Track myTrackThree = new Track("102938", "Tiptoe", "Imagine Dragons", "3:14", "Imagine Dragons", "06/03/2012", "Night Visions", "Indie rock");
        Track myTrackFour = new Track("748392", "Bohemian Rhapsody", "Queen", "5:55", "Queen", "31/10/1975", "A Night at the Opera", "Hard rock");

        emptyTrack.setId("123456");
        emptyTrack.setTitle("Shape of You");
        emptyTrack.setArtist("Ed Sheeran");
        emptyTrack.setLength("3:56");
        emptyTrack.setComposer("Ed Sheeran");
        emptyTrack.setReleaseDate("06/01/2017");
        emptyTrack.setAlbum("÷");
        emptyTrack.setGenre("Pop");

        emptyTrack.displayTrackInfo();
        myTrackOne.displayTrackInfo();
        myTrackTwo.displayTrackInfo();
        myTrackThree.displayTrackInfo();
        myTrackFour.displayTrackInfo();
    }
    
    private void testTrackListClass() {
        Track emptyTrack = new Track("123456", "Shape of You", "Ed Sheeran", "3:56", "Ed Sheeran", "06/01/2017", "÷", "Pop");
        Track myTrackOne = new Track("654321", "Wow", "Post Malone", "2:30", "Post Malone", "24/12/2018", "Hollywood's Bleeding", "Hip hop");
        Track myTrackTwo = new Track("567890", "Lose Yourself", "Eminem", "5:20", "Eminem", "28/10/2002", "Curtain Call", "Hip hop");
        Track myTrackThree = new Track("102938", "Tiptoe", "Imagine Dragons", "3:14", "Imagine Dragons", "06/03/2012", "Night Visions", "Indie rock");
        Track myTrackFour = new Track("748392", "Bohemian Rhapsody", "Queen", "5:55", "Queen", "31/10/1975", "A Night at the Opera", "Hard rock");
        
        TrackList myList = new TrackList();
        myList.addTrack(emptyTrack);
        myList.addTrack(myTrackOne);
        myList.addTrack(myTrackTwo);
        myList.addTrack(myTrackThree);
        myList.addTrack(myTrackFour);
        myList.displayAllTracks();
        myList.displayAllGenre("Hip hop");
        Track titleQuery = myList.searchByTitle("Shape of You");
        System.out.println("Track with name 'Shape of You': ");
        titleQuery.displayTrackInfo();
        Track artistQuery = myList.searchByArtist("Post Malone");
        System.out.println("Track with artist 'Post Malone': ");
        artistQuery.displayTrackInfo();
    }
    
    private void testTrackBSTClass() {
        
    }
    
    public String getMenuChoice( ) {
        System.out.print( "Please enter option: " );
        Scanner scanner = new Scanner (System.in);
        String choiceString = scanner.nextLine();
        return choiceString;
    } 
    
}
