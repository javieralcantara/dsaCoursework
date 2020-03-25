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
public class TrackList implements IADTrackList {

    Node head;

    class Node {
        Track track;
        Node next;

        Node(Track _track) {
            track = _track;
            next = null;
        }
    }

    @Override
    /** Adds a new Track to the TrackList.
     * @param newTrack A Track to add.
    */
    public void addTrack(Track newTrack) {
        Node newNode = new Node(newTrack);
        newNode.next = null;

        if(this.head == null) {
            this.head = newNode;
        } 
        else {
            Node last = this.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }  
    }

    @Override
    /** Displays a single Track from the TrackList.
     * @param _track A Track to be displayed.
    */
    public void displayTrack(Track _track) {
        _track.displayTrackInfo();
    }

    @Override
    /** Displays all Tracks matching a specific genre from the TrackList.
     * @param _genre A String String containing the
     *     Track’s genre.
    */
    public void displayAllGenre(String _genre) {
        Node actualNode = this.head;

        System.out.println("Tracks with " + _genre + " genre: ");
        System.lineSeparator();

        while (actualNode != null) {
            if(actualNode.track.getGenre().equals(_genre)) {
                actualNode.track.displayTrackInfo();
            }

            actualNode = actualNode.next;
        } 
    }

    @Override
    /** Displays all Tracks from the TrackList.
    */
    public void displayAllTracks() {
        Node actualNode = this.head;

        System.out.println("TrackList:");
        System.lineSeparator();

        while (actualNode != null) {
            actualNode.track.displayTrackInfo();

            actualNode = actualNode.next;
        } 
    }

    @Override
    /** Searches for a single Track by title from the TrackList.
     * @param _title A String containing the
     *     Track’s title.
     * @return The Track searched or an empty Track if not found.
    */
    public Track searchByTitle(String _title) {
        Node actualNode = this.head;

        while (actualNode != null) {
            if(actualNode.track.getTitle().equals(_title)){
                return actualNode.track;
            }

            actualNode = actualNode.next;
        }

        return new Track();
    }

    @Override
    /** Searches for a single Track by artist from the TrackList.
     * @param _artist A String containing the
     *     Track’s artist.
     * @return The Track searched or an empty Track if not found.
    */
    public Track searchByArtist(String _artist) {
        Node actualNode = this.head;

        while (actualNode != null) {
            if(actualNode.track.getArtist().equals(_artist)){
                return actualNode.track;
            }

            actualNode = actualNode.next;
        }

        return new Track();
    }

}
