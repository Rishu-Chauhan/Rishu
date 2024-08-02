import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;
public class creatingFile {
    public static void main(String[] args) {
//        File myFile=new File("rishu1.txt");
//        try{
//            myFile.createNewFile();
//        }
//        catch(IOException e){
//            System.out.println("unable to create a file");
//            e.printStackTrace();
//        }
//        try{
//            FileWriter fileWriter=new FileWriter("rishu1.txt");
//            fileWriter.write("this is our programm \n okay now");
//            fileWriter.close();
//    }
//        catch(IOException e){
//            e.printStackTrace();
//        }


        File myFile=new File("pt.java");
        try{
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()){
             String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
