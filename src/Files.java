
import java.io.IOException;
import java.io.PrintWriter;

public class Files {
    public static void main(String[] args) throws IOException
    {
        //create the file and open the file
        //if rhe file exists  it will replace the file
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");
        outputFile.println("this is line 1");
        outputFile.println("this is line 2");
        outputFile.println("this is line 3");

        
        outputFile.close();

    }     
}