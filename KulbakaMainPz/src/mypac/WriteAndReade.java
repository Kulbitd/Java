package mypac;

import java.io.*;
import java.util.Scanner;

public class WriteAndReade {
	public static void writespoints(Points[] poi,Circles[] cir,int kolvo1,int kolvo2) {
		try(FileWriter writer = new FileWriter("/Users/kulbit/Desktop/Java/KulbakaMainPz/txt/test1", false))
	    {
			for(int i = 0; i < kolvo1; i++) {
	        String buff = poi[i].toString();
	        writer.write(buff);
			}
			writer.append("\n");
			for(int i = 0; i < kolvo2; i++) {
		        String buff = cir[i].toString();
		        writer.write(buff);
				}
		}
	    catch(IOException ex){
	    	System.out.println(ex.getMessage());
	    } 
	} 
	
	public static String readpoints() {
        try(FileReader reader = new FileReader("/Users/kulbit/Desktop/Java/KulbakaMainPz/txt/test1"))
        {
        	BufferedReader buff = new BufferedReader(reader);
            String line1 = buff.readLine();
            return line1;
        }
        
        catch(IOException ex){
            
            System.out.println(ex.getMessage());
            return "";
        }   
    } 
	
	public static String readcircles() {
        try(FileReader reader = new FileReader("/Users/kulbit/Desktop/Java/KulbakaMainPz/txt/test1"))
        {
        	BufferedReader buff = new BufferedReader(reader);
            String line1 = buff.readLine();
            String line2 = buff.readLine();
            return line2;
        }
        catch(IOException ex){
            
            System.out.println(ex.getMessage());
            return "";
        	}   
    } 
	public static void writeforuser(Points[] poi,Circles[] cir,int kolvo1,int kolvo2,String adres) {
		try(FileWriter writer = new FileWriter(adres, false))
	    {
			for(int i = 0; i < kolvo1; i++) {
	        String buff = poi[i].drowuser();
	        writer.write(buff);
			}
			writer.append("\n");
			for(int i = 0; i < kolvo2; i++) {
		        String buff = cir[i].drowuser();
		        writer.write(buff);
				}
		}
	    catch(IOException ex){
	    	System.out.println(ex.getMessage());
	    } 
	} 
	

}