package com.jar.hackathon;

import java.io.File;
import java.util.HashMap;
import java.util.Objects;


class Data {


    private static HashMap<String, String> userCredentials = new HashMap<>();

    Data(){
        setUserCredentials();
    }

    boolean validateCredentials(String userName , String password){
        try {
            return Objects.equals(Data.userCredentials.get(userName), password);
        }catch (NullPointerException n){
            return false;
        }
    }

    private void setUserCredentials(){
        Data.userCredentials.put("a","b");
        File file = new File("");
    }

}
