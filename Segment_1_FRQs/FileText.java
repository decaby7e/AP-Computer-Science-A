import java.util.ArrayList;
public class FileText
{

     private String fileName;
     private int fileBytes;
     private ArrayList<String> wordList; // the contents of the text file

     // postcondition: calculates the number of bytes in this file and updates
     // the instance variable fileBytes
     public void fileSize()
     {
       fileBytes = wordList.size() + wordList.size() - 1;
     }

     // precondition: 0 < newWords.length < wordList.size ()
     // postcondition: elements from the newWords array are placed into consecutive
     // odd index positions of the wordlist ArrayList
     // postcondition: the value of fileBytes is updated
     public void mergeWords(String[] newWords)
     {
       for(int i = 1; i < newWords.length; i++)
       {
         wordList.add(i, newWords[i - 1]);
       }
     }

     // other methods not shown

 }
