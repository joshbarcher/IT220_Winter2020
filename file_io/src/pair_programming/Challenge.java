package pair_programming;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Challenge
{
    public static void main(String[] args)
    {
        babiesFromWoodStock();
        namesInWashington();
        percentBabiesNY();
    }

    public static void babiesFromWoodStock()
    {
        try (Scanner reader = new Scanner(
                new FileInputStream("files/baby_names.txt")))
        {
            int count = 0;
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                if (parts[1].equals("Woodstock") && parts[2].equals("Georgia"))
                {
                    count += Integer.parseInt(parts[3]);
                }
            }
            System.out.println("Babies born in Woodstock, Georgia: " + count);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Something went wrong ");
        }
    }

    public static void namesInWashington()
    {
        try (Scanner reader = new Scanner(
                new FileInputStream("files/baby_names.txt")))
        {
            int count = 0;
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                if (parts[2].equals("Washington"))
                {
                    count++;
                }
            }
            System.out.println("Unique names in WA: " + count);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Something went wrong ");
        }
    }

    public static void percentBabiesNY()
    {
        try (Scanner reader = new Scanner(
                new FileInputStream("files/baby_names.txt")))
        {
            //skip first line
            reader.nextLine();

            int count = 0;
            double total = 0;
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                int babies = Integer.parseInt(parts[3]);
                total += babies;

                if (parts[2].equals("New York"))
                {
                    count += babies;
                }
            }
            System.out.println("Percentage of babies born in NY: " + (count / total));
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Something went wrong ");
        }
    }
}
