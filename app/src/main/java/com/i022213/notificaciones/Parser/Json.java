package com.i022213.notificaciones.Parser;

import com.i022213.notificaciones.Models.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Json {

    public static List<User> parserJsonUser(String content) throws Exception {
        JSONArray myArray = new JSONArray(content);
        List<User> myUser = new ArrayList<>();

        for (int i=0; i<myArray.length(); i++){
            JSONObject item = myArray.getJSONObject(i);

            User usuario = new User();
            usuario.setUsername(item.getString("username"));
            usuario.setEmail(item.getString("email"));
            myUser.add(usuario);
        }

        return myUser;
    }

}