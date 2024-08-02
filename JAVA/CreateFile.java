import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CreateFile {
public static void main(String[]args){
    //Code to create a new file
// File f=new File("rishu.txt");
// try{
// f.createNewFile();
// }
// catch(IOException e){
// System.out.println("unable to create a file");
// e.printStackTrace();
// }
// //Code to write to a file
// try{
// FileWriter f1=new FileWriter("rishu.txt");
// f1.write("this is our first file from this java");
// f1.close();
// }
// catch(IOException e){
// e.printStackTrace();
// }
//Code to read a file
File f2=new File("rishu1.txt");
try{
    Scanner sc =new Scanner(f2);
    while(sc.hasNextLine()){
     String line=sc.nextLine();
     System.out.println(line);
    }
    sc.close();
}
catch(FileNotFoundException e){
    e.printStackTrace();
}
}
}
