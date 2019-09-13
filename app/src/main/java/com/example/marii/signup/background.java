package com.example.marii.signup;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class background extends AsyncTask <String, Void, String>{
    AlertDialog dialog;
    Context context;
    public background(Context context){
        this.context = context;
    }


    @Override
    protected void onPreExecute() {
        dialog = new AlertDialog.Builder(context).create();
        dialog.setTitle("Login Status");
    }
    @Override
    protected void onPostExecute(String s) {
        dialog.setMessage(s);
        dialog.show();
    }

    @Override
    protected String doInBackground(String... voids) {
        String result = "";
        String username = voids[0];
        String password = voids[1];

        String connstr = "http://192.168.1.108/restaurant/login.php";
        try{
            URL url = new URL(connstr);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);

            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            String data = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(username, "UTF-8")
                    + "&&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");
            writer.write(data);
            writer.flush();
            writer.close();
            outputStream.close();

            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "ISO-8859-1"));
            String line = "";
            while ((line = reader.readLine()) != null){
                result += line;
            }
            reader.close();
            inputStream.close();
            httpURLConnection.disconnect();
            return result;


        }catch (MalformedURLException e){
            result = e.getMessage();
        }catch (IOException e){
            result = e.getMessage();
        }



        return result;
    }
}
