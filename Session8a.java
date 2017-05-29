//a simple program which copy text from one file to another file
import java.io.*;
public class Session8a{

     public static void main(String[] args)throws IOException {

         FileReader fr = null;
         FileWriter fw = null;

         try{   
              fr=new FileReader("hello.txt");//passing sourc file to constructor
              fw=new FileWriter("hellowworld1.txt");//passing destination file to constructor
              int c=fr.read();//read first character of file
              while(c!=-1){//endof file is not reached
      
                  fw.write(c);//writing the character to destination file
                  c = fr.read();
               }
          } 
           catch(IOException e){ 
 
                System.out.println(e);
           } 
            finally{ 
 
                 fr.close();//close source file
                 fw.close();//close destination file
            }
      }
}

