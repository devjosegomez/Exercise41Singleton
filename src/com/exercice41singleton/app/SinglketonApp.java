package com.exercice41singleton.app;
import com.exercice41singleton.model.MiSingleton;
public class SinglketonApp {

	public static void main(String[] args) {
		String urlServer = "jdbc://mysql://localhost:3306/tiendita";
		String user ="root";
		String pass= "root";
		MiSingleton objMisingleton = MiSingleton.getInstance(urlServer, user, pass);
		MiSingleton objMisingleton2 = MiSingleton.getInstance("url2", "user2", "pass2");
		MiSingleton objMisingleton3 = MiSingleton.getInstance("url3", "user3", "pass3");
	}

}
