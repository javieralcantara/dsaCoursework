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
public interface IADTrackList{
    public void addTrack(Track _track);
    public void displayTrack(Track _track);
    public void displayAllGenre(String _genre);
    public void displayAllTracks();
    public Track searchByTitle(String _title);
    public Track searchByArtist(String _artist);
            
}
