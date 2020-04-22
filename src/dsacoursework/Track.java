/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

import java.util.ArrayList;

/**
 *
 * @author Javier Alcántara García
 */
public class Track implements Comparable<Track>{
    private String id, title, artist, length, composer, releaseDate, album, genre;


    /** Creates an empty Track with all attributes set to "0".
    */
    Track() {
        id = "0"; title = "0"; artist = "0"; length = "0"; composer = "0"; releaseDate = "0"; album = "0"; genre = "0";
    }

    /** Creates a Track with the specified values.
     * @param _id The Track’s id.
     * @param _title The Track’s title.
     * @param _artist The Track’s artist.
     * @param _length The Track’s length.
     * @param _composer The Track’s composer.
     * @param _releaseDate The Track’s release date.
     * @param _album The Track’s album.
     * @param _genre The Track’s genre.
    */
    Track(String _id, String _title, String _artist, String _length, String _composer, String _releaseDate, String _album, String _genre ) {
        id = _id; title = _title; artist = _artist; length = _length; composer = _composer; releaseDate = _releaseDate; album = _album; genre = _genre;
    }

    /** Sets the Track’s id.
     * @param _id A String containing the
     *     Track’s id.
    */
    void setId(String _id) {
        id = _id;
    }

    /** Sets the Track’s title.
     * @param _title A String containing the
     *     Track’s title.
    */
    void setTitle(String _title) {
        title = _title;
    }

    /** Sets the Track’s artist.
     * @param _artist A String containing the
     *     Track’s artist.
    */
    void setArtist(String _artist) {
        artist = _artist;
    }

    /** Sets the Track’s length.
     * @param _length A String containing the
     *     Track’s length.
    */
    void setLength(String _length) {
        length = _length;
    }

    /** Sets the Track’s composer.
     * @param _composer A String containing the
     *     Track’s composer.
    */
    void setComposer(String _composer) {
        composer = _composer;
    }

    /** Sets the Track’s release date.
     * @param _releaseDate A String containing the
     *     Track’s release date.
    */
    void setReleaseDate(String _releaseDate) {
        releaseDate = _releaseDate;
    }

    /** Sets the Track’s album.
     * @param _album A String containing the
     *     Track’s album.
    */
    void setAlbum(String _album) {
        album = _album;
    }

    /** Sets the Track’s genre.
     * @param _genre A String containing the
     *     Track’s genre.
    */
    void setGenre(String _genre) {
        genre = _genre;
    }

    /** Gets the Track’s id.
     * @return A string representing the Track’s id.
    */
    String getId() {
        return id;
    }

    /** Gets the Track’s title.
     * @return A string representing the Track’s title.
    */
    String getTitle() {
        return title;
    }

    /** Gets the Track’s artist.
     * @return A string representing the Track’s artist.
    */
    String getArtist() {
        return artist;
    }

    /** Gets the Track’s length.
     * @return A string representing the Track’s length.
    */
    String getLength() {
        return length;
    }

    /** Gets the Track’s composer.
     * @return A string representing the Track’s composer.
    */
    String getComposer() {
        return composer;
    }

    /** Gets the Track’s release date.
     * @return A string representing the Track’s release date.
    */
    String getReleaseDate() {
        return releaseDate;
    }

    /** Gets the Track’s album.
     * @return A string representing the Track’s album.
    */
    String getAlbum() {
        return album;
    }

    /** Gets the Track’s genre.
     * @return A string representing the Track’s genre.
    */
    String getGenre() {
        return genre;
    }

    /** Gets and prints the Track’s information.
     * @return An ArrayList representing the Track’s attributes.
    */
    ArrayList getTrackInfo() {
        ArrayList trackInfo = new ArrayList();
        trackInfo.add("id: " + this.getId());
        trackInfo.add("title: " + this.getTitle());
        trackInfo.add("artist: " + this.getArtist());
        trackInfo.add("length: " + this.getLength());
        trackInfo.add("composer: " + this.getComposer());
        trackInfo.add("release date: " + this.getReleaseDate());
        trackInfo.add("album: " + this.getAlbum());
        trackInfo.add("genre: " + this.getGenre());

        return trackInfo;
    }

    
    /** Displays the Track’s information. 
     * This includes all the parameters a Track holds.
    */
    void displayTrackInfo() {
        System.out.println("Track: "+ this.getTrackInfo());
        System.lineSeparator();
    }
    
    /** Overrides toString() method to print a Track object.
     * @return A String representing a Track (look getTrackInfo()).
    */
    @Override
    public String toString() {
        return this.getTrackInfo() + "\n";
    }
    
    /** Overrides compareTo() method to compare two Track objects.
     * @return An Integer representing if the first Track is bigger than the second one.
     *         I compare their artists names in lexicographical order to do so. If both Tracks
     *         belong to the same artist, it returns -1 
    */
    @Override
    public int compareTo(Track compareTrack) {
        int value = this.artist.compareTo(compareTrack.artist);
        
        return value == 0 ? -1 : value;  
    }
}