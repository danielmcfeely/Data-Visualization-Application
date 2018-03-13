/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavisualization;

/**
 *
 * @author ColinApplebee
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Import {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("")); //Needs to be filled with CSV file
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+",");
        }
        scanner.close();
    }

}
