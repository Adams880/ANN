import Objects.*;

/**
 * Created by Adam Hayes on 7/1/2017 for project ANN.
 */
public class ANN {
    public static void main(String[] args) {
        int numOfInputs = 64;
        int numOfHiddenLayers = 4;
        int hL1Count = 64;
        int hL2Count = 32;
        int hL3Count = 16;
        int hL4Count = 10;
        double learningRate = .1;
        int numOfOutputs = 10;
        String testFile = "optdigits_test.txt";
        String trainFile = "optdigits_train.txt";
        int[] inputs;
        int count = 0;

        FileIO reader = new FileIO(trainFile, numOfInputs);
        inputs = reader.readNextLine();
        do {
            System.out.println("\n");
            for (int i = 0; i < numOfInputs; i++) {
                if (i % 8 == 0) {
                    System.out.println("");
                }
                if (inputs[i] < 10) {
                    System.out.print("0");
                }
                System.out.print(inputs[i] + " ");
            }
            System.out.println("\nNumber to Mimic: " + inputs[numOfInputs]);
            count++;
            inputs = reader.readNextLine();
        } while (!reader.getFileRead());
        System.out.println("\nTotal Number of Handwritten Digits: " + count);
    }
}

//Programmed By: Adam Hayes