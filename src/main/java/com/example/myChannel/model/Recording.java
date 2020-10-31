package com.example.myChannel.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.beans.JavaBean;
import java.net.URL;
import java.util.Objects;

@JavaBean
public class Recording {
    private String artistName;
    private TypeTrack typeTrack;
    private String compositionName;
    private String albumName;
    private int year;
    private URL urlCover;
    private String genre;
    private int len;
    private URL urlFile;

    @Autowired
    public Recording(String artistName, TypeTrack typeTrack, String compositionName, String albumName, int year, URL urlCover, String genre, int len, URL urlFile) {
        this.artistName = artistName;
        this.typeTrack = typeTrack;
        this.compositionName = compositionName;
        this.albumName = albumName;
        this.year = year;
        this.urlCover = urlCover;
        this.genre = genre;
        this.len = len;
        this.urlFile = urlFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recording recording = (Recording) o;
        return year == recording.year &&
                len == recording.len &&
                Objects.equals(artistName, recording.artistName) &&
                typeTrack == recording.typeTrack &&
                compositionName.equals(recording.compositionName) &&
                Objects.equals(albumName, recording.albumName) &&
                Objects.equals(urlCover, recording.urlCover) &&
                Objects.equals(genre, recording.genre) &&
                Objects.equals(urlFile, recording.urlFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistName, typeTrack, compositionName, albumName, year, urlCover, genre, len, urlFile);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public TypeTrack getTypeTrack() {
        return typeTrack;
    }

    public void setTypeTrack(TypeTrack typeTrack) {
        this.typeTrack = typeTrack;
    }

    public String getCompositionName() {
        return compositionName;
    }

    public void setCompositionName(String compositionName) {
        this.compositionName = compositionName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public URL getUrlCover() {
        return urlCover;
    }

    public void setUrlCover(URL urlCover) {
        this.urlCover = urlCover;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public URL getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(URL urlFile) {
        this.urlFile = urlFile;
    }
}
