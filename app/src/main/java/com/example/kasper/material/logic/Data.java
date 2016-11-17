package com.example.kasper.material.logic;

import android.os.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kasper on 17.11.16.
 */

public class Data {

    public static ArrayList<Song> getData(){

        ArrayList<Song> data = new ArrayList<Song>();
        ArrayList<HashMap<String, String>> songsList = SongsManager.getPlayList();

        int i = 0;
        for(HashMap<String, String> s: songsList){
            Song current = new Song();
            current.title = s.get("songTitle");
            current.length = 123;

            data.add(current);
        }

        return data;
    }

}
