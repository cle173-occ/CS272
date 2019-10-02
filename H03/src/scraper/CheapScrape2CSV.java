package scraper;

import java.io.*;
import java.util.*;

public class CheapScrape2CSV
{

    public static void main(String[] args) throws FileNotFoundException
    {
    	try {
			FileReader file = new FileReader(args[2]);
			Scanner scan = new Scanner(file);
			String[] x = new String[36];
			int columns = Integer.parseInt(args[1]);
			
			int i = 0;
			while(scan.hasNextLine()) {

			    x[i] = scan.nextLine();
			    //System.out.println(x[i]);
			    i++;           
			    
			}
			
			scan.close();
			
			PrintWriter out = new PrintWriter(args[3]);
			
			for(int j = 0; j < x.length; j++) {
				
				if(j % 4 == 0 || x[j].contains("")) {
					out.print("\"" + x[j] + "\"" + "," );
				}
				else {
					out.print(x[j] + ", ");
				}
				
				if(j % columns == 3 && j != 0) {
					out.println();
				}
			}
			
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e instanceof  NumberFormatException) {
				System.err.println("Number Format Exception \n" + e.getMessage());
			}
			if(e instanceof FileNotFoundException) {
				System.err.println("File Not Found \n" + e.getMessage());
			}
		}
    }

}
