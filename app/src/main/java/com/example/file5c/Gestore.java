package com.example.file5c;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gestore {

    StringBuilder sb;

    public String leggiFile(String nomeFile, Context c){

        String daRestituire = "";

        try {
            BufferedReader fileDaLeggere = new BufferedReader(

                    new InputStreamReader(c.openFileInput(nomeFile)

                    ));



                    while((daRestituire = fileDaLeggere.readLine())!=null){

                        sb.append(daRestituire);


                    }

        } catch (FileNotFoundException e) {
            Log.e("errGestore","file Inesistente");
        } catch (IOException e) {
           Log.e("Gestore","file non corretto");
        }

        return daRestituire.toString();
}


}
