/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumfile;
import java.io.*;

/**
 *
 * @author glSon8840
 */
public class RandomNumFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
 
    int randomNum;

    //PrintWriter class is used to open a file for output
    //It is used in conjunction with the FileWriter class

    PrintWriter fileOut = new PrintWriter(new FileWriter("randNums.txt"));
    for(int i = 1; i <= 100; i++){
      //Generate a random number between 0 - 99
      randomNum = (int)(Math.random() * 100);

      //Output directly to file
      fileOut.println(randomNum);
    }

    //The file must be closed after writing is complete
    fileOut.close();
    }
    
}
