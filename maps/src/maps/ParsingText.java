package maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ParsingText
{
    public static void main(String[] args)
    {
        TreeMap<String, Integer> counts = getWordFrequencies();

        for (String word : counts.keySet())
        {
            System.out.println(word + " -> " + counts.get(word));
        }
    }

    public static Map.Entry<String, Integer> getMaximumWordFrequency()
    {
        return null;
    }

    private static TreeMap<String, Integer> getWordFrequencies()
    {
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        try (Scanner reader = new Scanner(
                new FileInputStream("files/war_and_peace.txt")))
        {
            while (reader.hasNextLine())
            {
                //get my line, then the words in the line
                String line = reader.nextLine();
                String[] words = line.split(" ");

                //update my frequencies in the map...
                for (String word : words)
                {
                    //word is already in map
                    if (wordCount.containsKey(word))
                    {
                        //update the frequency
                        int frequency = wordCount.get(word);
                        frequency++;

                        //update the value in the map
                        wordCount.put(word, frequency);
                    }
                    else //word is not in map
                    {
                        wordCount.put(word, 1);
                    }
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading from file");
        }

        return wordCount;
    }
}
