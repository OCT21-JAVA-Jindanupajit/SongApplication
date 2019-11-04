## Required Assignment: Finish this project

Copy the following code to a new IntelliJ project. Next fix the program so it works. This is a solo assignment. 

    package com.company;
     
     import java.util.ArrayList;
     
     public class Main {
     
         public static void main(String[] args) {
     
            ArrayList<XXXX> songs = new ArrayList<>();
            for (int i = 0; i< 3;i++){
                String artist = "Prince";//modify program to prompt user for an artist
                String title = "Purple Rain"; //modify program to prompt user for a title
                 XXXX s = new Song();
                s.setArtist(artist);
                s.setTitle(title);
                songs.add(s);
             }
     
             //print all the songs in the array list
             for(Song xxxx: songs){
                System.out.println(xxxx.display());
             }
     
             //look for blue and print if found
             String titleToFind = "Purple Rain";
             for (XXXX xxxx: xxxx){
                if (xxxx.getTitle().equals(titleToFind)){
                    System.out.printf("I found %s \r\n",song.display());
                 }
             }
         }
     }
 
