package Objects;

/**
 * Created by Adam Hayes on 7/1/2017 for project ANN.
 */
public class Network {
    int numOfInputs;
    int numOfHiddenLayers;
    int hL1Count;
    int hL2Count;
    int hL3Count;
    int hL4Count;
    double learningRate;
    int numOfOutputs;

    public Network() {

    }

    public Network(int numOfInputs, int numOfHiddenLayers, int hL1Count, int hL2Count, int hL3Count, int hL4Count, double learningRate, int numOfOutputs) {
        this.numOfInputs = numOfInputs;
        this.numOfHiddenLayers = numOfHiddenLayers;
        this.hL1Count = hL1Count;
        this.hL2Count = hL2Count;
        this.hL3Count = hL3Count;
        this.hL4Count = hL4Count;
        this.learningRate = learningRate;
        this.numOfOutputs = numOfOutputs;
    }

    public void networkGen() {

    }
}

//Programmed By: Adam Hayes