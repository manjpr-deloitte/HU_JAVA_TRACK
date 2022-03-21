import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
public class FileHandling
{
    public static void main(String [] args)throws Exception
    {
        String path = "StudentData.csv";
        String line = "";
        File csvfile = new File("SelectedStudents.csv");
        PrintWriter pw = new PrintWriter(csvfile);
        int i;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line=br.readLine()) != null) {
                String[] values = line.split(",");
                int x = 0;
                if (Character.isDigit(values[4].charAt(0))) {
                    x = Integer.parseInt(values[4]);
                }
                if (x > 0 && x <= 5) {
                    pw.print(values[0]);
                    pw.print(",");
                    pw.print(values[1]);
                    pw.print(",");
                    pw.print(values[2]);
                    pw.print(",");
                    pw.print(values[3]);
                    pw.print(",");
                    pw.print(values[4]);
                    pw.print("\n");
                }
            }
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}