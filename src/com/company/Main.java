package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();

        Scanner kb = new Scanner(System.in);

        for (int i = 0; i< 3;i++){
            System.out.printf("Record #%d: \n", i+1);

            System.out.printf( "artist > ");
            String artist = kb.nextLine();//modify program to prompt user for an artist

            System.out.printf( "title > ");
            String title = kb.nextLine(); //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song: songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}
