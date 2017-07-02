package Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam Hayes on 7/1/2017 for project ANN.
 */
public class Node {
    private List<Node> children = new ArrayList<>();
    private List<Node> parents = new ArrayList<>();
    private double input;
    private double output;
    private double ignitionEqn;
    private double[] weightUpdates;
    private double weightUpdateSummation;

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public double getIgnitionEqn() {
        return ignitionEqn;
    }

    public void setIgnitionEqn(double ignitionEqn) {
        this.ignitionEqn = ignitionEqn;
    }

    public double[] getWeightUpdates() {
        return weightUpdates;
    }

    public void setWeightUpdates(double[] weightUpdates) {
        this.weightUpdates = weightUpdates;
    }

    public double getWeightUpdateSummation() {
        return weightUpdateSummation;
    }

    public void setWeightUpdateSummation(double weightUpdateSummation) {
        this.weightUpdateSummation = weightUpdateSummation;
    }

    public Node(Node parent) { parents.add(parent);
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild (Node child) {
        children.add(child);
    }

    public List<Node> getParents() {
        return parents;
    }
}

//Programmed by: Adam Hayes