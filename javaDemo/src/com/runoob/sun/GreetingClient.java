package com.runoob.sun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

//socket client
public class GreetingClient {

	public static void main(String[] args) {
		String serverName = "192.168.1.113";
		int port = 8888;
        try {
        
        	System.out.println("主机:" + serverName + "端口号:" + port);
        	
        	Socket client = new Socket(serverName , port);
        System.out.println("远程主机地址:" + client.getRemoteSocketAddress());
        
        OutputStream os = (OutputStream) client.getOutputStream();
        InputStream is = (InputStream) client.getInputStream();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("hello server from" + client.getLocalSocketAddress());
        bw.flush();
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        System.out.println("服务器响应:" + bf.readLine());
        client.close();
        
        }
        catch(IOException e){
        	   
        }
	}
}
