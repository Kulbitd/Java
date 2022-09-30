package mypac;

import java.io.*;
import java.util.Scanner;

public class WriteAndReade {
	public static void writespoints(Points[] poi,Circles[] cir,int kolvo1,int kolvo2) {
		try(FileWriter writer = new FileWriter("./../../txt/test1", false))
	    {
			for(int i = 0; i < kolvo1; i++) {
	        String buff = poi[i].toString() + ",";
	        writer.write(buff);
	        if (i == kolvo1 -1) {
	        	writer.append("\n");
	        }
			}
			for(int i = 0; i < kolvo2; i++) {
		        String buff = cir[i].toString() + ",";
		        writer.write(buff);
				}
		}
	    catch(IOException ex){
	    	System.out.println(ex.getMessage());
	    } 
	} 
}