import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class CurrencyGraph {

    private List<ConversionDirectionList> adjList;

    public CurrencyGraph() {
        adjList = new ArrayList<>();
    }

    public List<ConversionDirectionList> getAdjList() {
        return adjList;
    }

    public void printAdjacencyList() {
        System.out.println("Adjacency List:");
        for (ConversionDirectionList conversionList : adjList) {
            System.out.println("Currency: " + conversionList.getLabel());
            CurrencyNode current = conversionList.getRoot();
            while (current != null) {
                Conversion conversion = current.getConversion();
                System.out.println("  -> " + conversion.getConversionRate() + " " + conversion.getConvertsTo());
                current = current.getNext();
            }
            System.out.println();
        }
    }

    public void addCurrencyNode(String label, double conversionRate, String convertsTo) {
        Conversion newConversion = new Conversion(label, convertsTo, conversionRate);

        // Find the ConversionDirectionList with the given label, or create a new one if not found
        ConversionDirectionList list = findConversionDirectionList(label);
        if (list == null) {
            list = new ConversionDirectionList(label);
            adjList.add(list);
        }

        list.addConversion(newConversion, convertsTo);
    }

    private ConversionDirectionList findConversionDirectionList(String label) {
        for (ConversionDirectionList list : adjList) {
            if (list.getLabel().equals(label)) {
                return list;
            }
        }
        return null;
    }

}