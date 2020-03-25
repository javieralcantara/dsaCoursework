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
    public void displayTrack(Track _track) {
        _track.displayTrackInfo();
    }

    @Override
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
