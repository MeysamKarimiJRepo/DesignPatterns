package com.meysamk.patterns.proxy;

public class MovieMediaPlayer implements MediaPlayer {
    public MovieMediaPlayer() {
        loadVideo();
    }

    @Override
    public void playMedia() {
        System.out.println("playing video ...");
    }

    private void loadVideo() {
        System.out.println("Loading up large video ...");
    }
}
