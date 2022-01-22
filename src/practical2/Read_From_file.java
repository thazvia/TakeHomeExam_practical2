package practical2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read_From_file {

public static void main(String[] args)  {
		
		String file="data\\practice.csv";
		
		Read_From_file obj =new Read_From_file();
		
		System.out.print(obj.readGivenList(1,file).split(",")[0]+ " 1--");
		System.out.println(obj.readGivenList(2,file).split(",")[0]);
		System.out.print(obj.readGivenList(1,file).split(",")[1]+ "--");
		System.out.println(obj.readGivenList(2,file).split(",")[1]);
		System.out.print(obj.readGivenList(1,file).split(",")[2]+ "--");
		System.out.println(obj.readGivenList(2,file).split(",")[2]);
		System.out.print(obj.readGivenList(1,file).split(",")[0]+ " 2--");
		System.out.println(obj.readGivenList(3,file).split(",")[0]);
		System.out.print(obj.readGivenList(1,file).split(",")[1]+ "--");
		System.out.println(obj.readGivenList(3,file).split(",")[1]);
		System.out.print(obj.readGivenList(1,file).split(",")[2]+ "--");
		System.out.println(obj.readGivenList(3,file).split(",")[2]);
		System.out.print(obj.readGivenList(1,file).split(",")[0]+ " 3--");
		System.out.println(obj.readGivenList(4,file).split(",")[0]);
		System.out.print(obj.readGivenList(1,file).split(",")[1]+ "--");
		System.out.println(obj.readGivenList(4,file).split(",")[1]);
		

	}


public  String readGivenList(int LineNum,String path)  {
		
	List<String> allLines = new ArrayList<String>();
	
	try{
		File f= new File(path);
		 
		 FileReader fr= new FileReader(f);
		 
		 BufferedReader br= new BufferedReader(fr);
	
		 String line;
		 while((line=br.readLine()) != null){
			 allLines.add(line);
		 }
	}
	catch(IOException e) {
		System.out.println("something went wrong with your file");
		e.printStackTrace();
	}

	return allLines.get(LineNum-1);
}
}



