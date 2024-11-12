package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

@SpringBootApplication
public class SslServerApplication {
	
	public static String toHexString(byte[] byteArray)
    {
        // Printing the hexadecimal equivalent as string
        // representation from the BigInteger class.
		String hex = new BigInteger(1, byteArray).toString(16);
		return hex;
    }
	
	public static String encryptString(String data) throws NoSuchAlgorithmException {
		String name = data;
		
		//MessageDigest Object Instantiation
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		byte[] messageDigest = md.digest(name.getBytes());
		return toHexString(messageDigest);
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		SpringApplication.run(SslServerApplication.class, args);
		System.out.println("Zane Deso, Checksum validation:");
		System.out.print(encryptString("Hello World Check Sum!"));
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
	
	public static String toHexString(byte[] byteArray)
    {
        // Printing the hexadecimal equivalent as string
        // representation from the BigInteger class.
		String hex = new BigInteger(1, byteArray).toString(16);
		return hex;
    }
	
	public static String encryptString(String data) throws NoSuchAlgorithmException {
		String name = data;
		
		//MessageDigest Object Instantiation
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		byte[] messageDigest = md.digest(name.getBytes());
		return toHexString(messageDigest);
	}
	
    
	@GetMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException{
		
		
		String newline = System.lineSeparator();
    	String data = "Hello World Check Sum!";
    	String cipher = "SHA-256";
    	String hash = encryptString(data);
    	String values = "Data: " + data + newline + "Cipher chosen: " + cipher + newline + "Hash value: " + hash;
    	
        return values;
    }
}