package com.meysamk.patterns.proxy;

public class App {
    private static final MediaPlayerProxy mediaPlayerProxy = new MediaPlayerProxy();
    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading the movie library ...");
        mediaPlayerProxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies ... ");
        mediaPlayerProxy.playMedia();
    }
}