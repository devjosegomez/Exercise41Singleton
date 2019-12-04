package com.exercice41singleton.model;

public class MiSingleton {
	//2. Instancia privada statica
	private static MiSingleton MySingle=null;
	private static String urlServer;
	private static String user;
	private static String pass;
	
	//1. Constructor privado
	private MiSingleton() {
		
	}
	
	//3. metodo getInstance public static
	public static MiSingleton getInstance(String url, String username, String password) {
		if(MySingle == null) {
			urlServer = url;
			user = username;
			pass = password;
			
			 MySingle = new MiSingleton();
		}else {
			System.out.println("No se pudo crear el objeto porque ya fue instanciado");
			System.out.println("URL: " + urlServer);
			System.out.println("Username: " + user);
			System.out.println("Password: " + pass);
		}
		
		return MySingle;
	}
}
