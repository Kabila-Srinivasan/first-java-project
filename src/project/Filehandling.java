package project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import  java.util.Scanner;
import java.io.FileWriter;
import java.util.Calendar;
public class Filehandling {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		String str=cal.getTime().toString();
		// TODO Auto-generated method stub
		// Import the File class

		// Import the IOException class to handle errors
		
		
				try {
					File Obj = new File("myfile.txt");
					if (Obj.createNewFile()) {
						System.out.println("File created: "
										+ Obj.getName());
					}
					else {
			            Scanner Reader = new Scanner(Obj);
			            while (Reader.hasNextLine()) {
			                String name= Reader.next();
			                String num=Reader.next();
			                
			                String regex="[7-9]{1}[0-9]{9}";
			                if(num.matches(regex)==true)
			                {
			                	File myObj=new File(name+".txt");
			                    try
			                	{
			                    	FileWriter mywrite=new FileWriter(myObj);
			                    	mywrite.write(str);
			                    	mywrite.close();
			                	}
			                	catch(IOException e)
			                	{
			                		e.printStackTrace();
			                	}
			                }
			              
			            }
			          
					}
				}
				catch (IOException e) {
					System.out.println("An error has occurred.");
					e.printStackTrace();
				}
			}



	}


