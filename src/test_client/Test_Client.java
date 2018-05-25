/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Snookie
 */
public class Test_Client {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       /* Socket sock=new Socket("localhost",9999);
        PrintStream pr=new PrintStream(sock.getOutputStream());
        System.err.println("Client Start Enter Some thing : ");
        InputStreamReader rd=new InputStreamReader(System.in);
        BufferedReader ed=new BufferedReader(rd);
        
        String tep=ed.readLine();
        pr.println(tep);*/
       String name="ss";
       Socket socket=new Socket("localhost",4444);
       PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true);
       BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
       while(true){
       String readerInput=bufferedReader.readLine();
       printWriter.println(name +": "+readerInput);}
       
        
        
    }
    
}
