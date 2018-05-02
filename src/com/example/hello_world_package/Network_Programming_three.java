package com.example.hello_world_package;

import java.io.*;
import java.net.*;

public class Network_Programming_three {
    public static void main(String[] args) throws IOException {


        String line, result = "";



        try {

            //creating a url, the url link denotes a php file that has some string value to be returned to this program when invoked
            URL url = new URL("http://adhikariaashish.com.np/Java_Network_Connection_demo.php");

            //connecting to a url
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            //Set the method for the URL request, one of: GET POST HEAD OPTIONS PUT DELETE TRACE are legal
            httpURLConnection.setRequestMethod("POST");

            //to denote that the connection will be used for output. The default value is false because many types of URLs do not support being written to.
            httpURLConnection.setDoOutput(true);

            //to denote that the connection will be used for input. The default value is true because clients typically read from a URLConnection.
            httpURLConnection.setDoInput(true);

            //getOutputStrream() returns the output stream of the URL connection for writing to the resource
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            String post_data = URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("Java_Program_Demo", "UTF-8");
            bufferedWriter.write(post_data);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();

            //getInputStream() returns the input stream of the URL connection for reading from the resource
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }
            bufferedReader.close();
            inputStream.close();

            //disconnecting the connection
            httpURLConnection.disconnect();
            //======================
            //printing the output as a whole
            System.out.println(result+"\n");

            //parsing the output and showing individually
            String[] parts = result.split("]");


            String firstMsg = parts[0];
            String secondMsg = parts[1];
            String thirdMessage = parts[2];
            String fourthMsg = parts[3];
            String fifthMsg = parts[4];
            String sixthMsg = parts[5];

            System.out.println(firstMsg);
            System.out.println("\t"+secondMsg);
            System.out.println("\t"+thirdMessage);
            System.out.println("\t"+fourthMsg);
            System.out.println("\t"+fifthMsg);
            System.out.println("\t"+sixthMsg);




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




