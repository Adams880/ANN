package Objects;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Adam Hayes on 7/1/2017 for project ANN.
 */

public class FileIO {
    private String file;
    private int lineCounter;
    private CSVReader read;
    private boolean fileRead;
    private int numOfInputs;
    private int contentsOfLine;

    public FileIO (String file) {
        try {
            this.file = file;
            read = new CSVReader(new FileReader(file), ',');
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public boolean getFileRead() { return fileRead; }

    public FileIO (String file, int numOfInputs) {
        this.numOfInputs = numOfInputs;
        contentsOfLine = numOfInputs + 1;
        //System.out.println(contentsOfLine);
        fileRead = false;
        try {
            read = new CSVReader(new FileReader(file), ',');
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public int[] readNextLine() {
        int[] lineContents = new int[contentsOfLine];
        String[] nextLine;
        try {
            if ((nextLine = read.readNext()) != null) {
                //System.out.println(nextLine.length);
                for (int i = 0; i < numOfInputs; i++) {
                    lineContents[i] = Integer.parseInt(nextLine[i]);
                }
                lineContents[numOfInputs] = Integer.parseInt(nextLine[numOfInputs]);
            } else {
                fileRead = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lineContents;
    }
}

//Programmed By: Adam Hayes
