package br.ufjf.dcc.gmr.core.vcs.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestJoao {

    public static void main(String[] args) throws IOException {

        String repoLink = "https://github.com/OpenAI/gpt-3";
        String repoName = getRepoName(repoLink);
        String apiUrl = "https://api.github.com/repos/" + repoName;

        int stars = getGitHubData(apiUrl, "stargazers_count");
        int watchers = getGitHubData(apiUrl, "subscribers_count");
        int commits = getGitHubData(apiUrl + "/commits", "total_count");
        int issues = getGitHubData(apiUrl + "/issues", "total_count");
        int branches = getGitHubData(apiUrl + "/branches", "total_count");
        int contributors = getGitHubData(apiUrl + "/contributors", "total_count");
        int pullRequests = getGitHubData(apiUrl + "/pulls", "total_count");
        int releases = getGitHubData(apiUrl + "/releases", "total_count");
        int forks = getGitHubData(apiUrl, "forks_count");

        System.out.println("Stars: " + stars);
        System.out.println("Watchers: " + watchers);
        System.out.println("Commits: " + commits);
        System.out.println("Issues: " + issues);
        System.out.println("Branches: " + branches);
        System.out.println("Contributors: " + contributors);
        System.out.println("Pull Requests: " + pullRequests);
        System.out.println("Releases: " + releases);
        System.out.println("Forks: " + forks);
    }

    private static String getRepoName(String repoLink) {
        String[] segments = repoLink.split("/");
        String owner = segments[segments.length - 2];
        String repo = segments[segments.length - 1];
        return owner + "/" + repo;
    }

    private static int getGitHubData(String apiUrl, String dataField) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
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
        JsonElement je = JsonParser.parseString​(json);
        String prettyJsonString = gson.toJson(je);
        
        System.out.println(apiUrl);
        System.out.println(prettyJsonString);
        
        conn.disconnect();
        return 1;

//        Pattern pattern = Pattern.compile("\"" + dataField + "\":\\s*(\\d+)");
//        Matcher matcher = pattern.matcher(json);
//
//        if (matcher.find()) {
//            return Integer.parseInt(matcher.group(1));
//        } else {
//            throw new RuntimeException("Failed to parse " + dataField + " from response: " + json);
//        }
    }

}
