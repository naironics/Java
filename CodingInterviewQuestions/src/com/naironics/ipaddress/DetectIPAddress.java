package com.naironics.ipaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DetectIPAddress {
	
	public static void main(String[] args) throws UnknownHostException{
		InetAddress addr = InetAddress.getLocalHost();
		
		String ipAddress = addr.getHostAddress();
		
		String hostName = addr.getHostName();
		
		System.out.println("IP Address of Local Host is : " + ipAddress);
		
		System.out.println("Host Name of Local Host is : " + hostName );
	}

}
