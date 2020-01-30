package Trash;


import org.json.JSONObject;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class JSONtest {



    public static void main(String[] args) throws IOException {

        String inline="";

        URL newURL= new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&key=AIzaSyA2oY0hwe-NqI11vRi0b15n-rvWOLhp6t0");
        HttpURLConnection conn=(HttpURLConnection) newURL.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode=conn.getResponseCode();

        if (responseCode!=200){

            throw  new RuntimeException("HttpResponseCode: "+responseCode);
        }

        else {

            Scanner sc=new Scanner(newURL.openStream());

            while (sc.hasNext()){

              inline+=sc.nextLine();

            }


            sc.close();

        }



        JSONObject jsonObject= new JSONObject(inline);

        JSONObject object= jsonObject.getJSONObject("plus_code");



        System.out.println(object);
    }

}
