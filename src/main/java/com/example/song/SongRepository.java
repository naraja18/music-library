package com.example.song;

import com.example.song.Song;

import java.util.*;

public interface SongRepository {
    ArrayList<Song> getSongs();

    Song addSong(Song song);

    Song getSongById(int songId);

    Song updateSong(int songId, Song song);

    void deleteSong(int songId);
}