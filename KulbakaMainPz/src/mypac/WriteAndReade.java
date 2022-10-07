package mypac;

import java.io.*;
import java.io.IOException;

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
	public static void writeforuser(Points[] poi,Circles[] cir,int kolvo1,int kolvo2,String adres,int choise) {
		File file = new File(adres);
		if (file.exists()) {
		switch(choise) {
		case 1:
		try(FileWriter writer = new FileWriter(adres, false))
	    {
			for(int i = 0; i < kolvo1; i++) {
	        String buff = poi[i].drowuser();
	        writer.write(buff);
	        writer.append("\n");
			}
			for(int i = 0; i < kolvo2; i++) {
		        String buff = cir[i].drowuser();
		        writer.write(buff);
		        writer.append("\n");
				}
		}
	    catch(IOException ex){
	    	System.out.println(ex.getMessage());
	    }
		case 2:
			Points[] bufffornotsort1 = new Points[poi.length];
			System.arraycopy(poi, 0, bufffornotsort1, 0, bufffornotsort1.length);
			bufffornotsort1 = Sort.pointsortincrease(bufffornotsort1,kolvo1);
			
			Circles[] bufffornotsort2 = new Circles[cir.length];
			System.arraycopy(cir, 0, bufffornotsort2, 0, bufffornotsort2.length);
			bufffornotsort2 = Sort.circlessortincrease(bufffornotsort2,kolvo2);
			try(FileWriter writer = new FileWriter(adres, false))
		    {
				for(int i = 0; i < kolvo1; i++) {
			        String buff = bufffornotsort1[i].drowuser();
			        writer.write(buff);
			        writer.append("\n");
				}
				for(int i = 0; i < kolvo2; i++) {
			        String buff = bufffornotsort2[i].drowuser();
			        writer.write(buff);
			        writer.append("\n");
					}
			}
		    catch(IOException ex){
		    	System.out.println(ex.getMessage());
		    }
		case 3:
			Points[] bufffsort1 = new Points[poi.length];
			System.arraycopy(poi, 0, bufffsort1, 0, bufffsort1.length);
			bufffornotsort1 = Sort.pointsort(bufffsort1,kolvo1);
			
			Circles[] buffsort2 = new Circles[cir.length];
			System.arraycopy(cir, 0, buffsort2, 0, buffsort2.length);
			bufffornotsort2 = Sort.circlessort(buffsort2,kolvo2);
			try(FileWriter writer = new FileWriter(adres, false))
		    {
				for(int i = 0; i < kolvo1; i++) {
			        String buff = bufffornotsort1[i].drowuser();
			        writer.write(buff);
			        writer.append("\n");
				}
				for(int i = 0; i < kolvo2; i++) {
			        String buff = bufffornotsort2[i].drowuser();
			        writer.write(buff);
			        writer.append("\n");
					}
			}
		    catch(IOException ex){
		    	System.out.println(ex.getMessage());
		    }
		}
		System.out.println("Файл не найден");
		}
	}
}