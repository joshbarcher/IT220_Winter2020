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
        //test our methods
        //copy("files/baby_names.txt", "files/copy.txt");
        //usStates();
        totalBabies();
    }

    public static void copy(String source, String destination)
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

    public static void usStates()
    {
        Scanner reader = null;
        try
        {
            reader = new Scanner(
                    new FileInputStream("files/baby_names.txt"));

            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                System.out.println("State: " + parts[2]);
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
        }
    }

    public static void totalBabies()
    {
        Scanner reader = null;
        try
        {
            reader = new Scanner(
                    new FileInputStream("files/baby_names.txt"));

            //skip the first line
            reader.nextLine();

            int count = 0;
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                count += Integer.parseInt(parts[3]);
            }
            System.out.println("Names assigned: " + count);
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
        }
    }
}
