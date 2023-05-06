/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.Project;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaolima
 */
public class GitHubApi {

    private static final String API = "https://api.github.com/repos/";

    public static void getProjectData(Project project) {

    }

    private static String makeRequest(String name, String organization) throws IOException {
        String apiUrl = API + organization + "/" + name;
        URL url;
        HttpURLConnection conn;
        
        try {
            url = new URL(apiUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
        } catch (MalformedURLException | ProtocolException ex) {
            throw new IOException(ex);
        }
        
        conn.setRequestProperty("Accept", "application/vnd.github.v3+json");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String output;
        String json = "";

        while ((output = br.readLine()) != null) {
            json += output;
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonResponse = gson.toJson(JsonParser.parseString​(json));

        return jsonResponse;
    }
}
