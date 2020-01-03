package pair_programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class BabyNames
{
    public static void main(String[] args)
    {
        Scanner reader = null;
        PrintWriter writer = null;
        try
        {
            reader = new Scanner(
                new FileInputStream("files/baby_names.txt"));
            writer = new PrintWriter(
                new FileOutputStream("files/copy.txt"));

            while (reader.hasNextLine())
            {
                writer.println(reader.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Something went wrong when reading/writing...");
        }
        finally
        {
            if (reader != null)
            {
                reader.close();
            }
            if (writer != null)
            {
                writer.close();
            }
        }
    }
}
