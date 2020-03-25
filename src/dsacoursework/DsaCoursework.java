/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

/**
 *
 * @author Javier Alcántara García
 */
public class DsaCoursework {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
       
        
        TrackList myList = new TrackList();
        myList.addTrack(emptyTrack);
        myList.addTrack(myTrackOne);
        myList.addTrack(myTrackTwo);
        myList.addTrack(myTrackThree);
        myList.addTrack(myTrackFour);
        myList.displayAllTracks();
        myList.displayAllGenre("Hip hop");
        Track titleQuery = myList.searchByTitle("Shape of You");
        titleQuery.displayTrackInfo();
        Track artistQuery = myList.searchByArtist("Post Malone");
        artistQuery.displayTrackInfo();
        
        
        TrackBST myBinaryTrackTree = new TrackBST();
        myBinaryTrackTree.loadData();
        
    }
    
}
