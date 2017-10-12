package com.runoob.sun;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

//socket client
public class GreetingClient {

	public static void main(String[] args) {
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
        try {
        
        	System.out.println("主机:" + serverName + "端口号:" + port);
        	
        	Socket client = new Socket(serverName , port);
        System.out.println("远程主机地址:" + client.getRemoteSocketAddress());
        
        OutputStream outToServer = (OutputStream) client.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);   //传出数据
        out.writeUTF("Hello from" + client.getLocalSocketAddress());
        
        InputStream infromServer = (InputStream) client.getInputStream();
        DataInputStream in = new DataInputStream(infromServer);
        System.out.println("服务器响应:" + in.readUTF());
        client.close();
        
        }
        catch(IOException e){
        	   
        }
	}
}
