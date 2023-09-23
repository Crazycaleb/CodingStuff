import java.util.ArrayList;
/**
 * @author Caleb Carlton
 */
public class Sequence {

    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public int size() {
        return values.size();
    }

    public int get(int i) {
        return values.get(i);
    }

    public Sequence append(Sequence other) {

        Sequence appendedArray = new Sequence();
        for (int i = 0; i < values.size(); i++) {
            appendedArray.add(values.get(i));
        }
        for (int i = 0; i < other.size(); i++) {
            appendedArray.add(other.get(i));
        }

        return appendedArray;
    }
}
