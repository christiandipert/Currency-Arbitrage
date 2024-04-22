/**
 * Implementation of a generic singly linked list specialized for storing edges in an adjacency list.
 */
public class ConversionDirectionList {

    private CurrencyNode root;
    private String label;

    /*
     * Constructs an empty linked conversion chain
     */
    public ConversionDirectionList(String label) {
        root = null;
        this.label = label;
    }

    /**
     * Constructs a conversion chain with a single edge as its root.
     */
    public ConversionDirectionList(Conversion conversion, String label) {
        root = new CurrencyNode(conversion, label);
    }

    /*
     * Returns the starting Currency for which the current chain maps to.
     */
    public String getLabel() {
        return label;
    }

    /*
     * Returns the root conversion node of the currency chain.
     */
    public CurrencyNode getRoot() {
        return root;
    }

     /**
     * Retrieves a CurrencyNode based on the currency it converts to.
     * @param convertsTo The currency to convert to.
     * @return The CurrencyNode corresponding to the specified currency, or null if not found.
     */
    public CurrencyNode getNodeByConvertsTo(String convertsTo) {
        CurrencyNode current = root;
        while (current != null) {
            if (current.getConversion().getConvertsTo().equals(convertsTo)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
    
    /**
     * Adds a new conversion to the adjacency list.
     * @param conversion The edge to be added.
     */
    public void addConversion(Conversion conversion, String label) {
        if (root == null) {
            root = new CurrencyNode(conversion, label);
            return;
        }

        CurrencyNode lastNode = goToEndNode();
        lastNode.setNext(new CurrencyNode(conversion, label));
    }

    /**
     * Traverses the chain to get the currency with no map to it.
     * @return The last node of the linked list.
     */
    private CurrencyNode goToEndNode() {
        CurrencyNode currentConversion = root;
        while (currentConversion.getNext() != null) {
            currentConversion = currentConversion.getNext();
        }
        return currentConversion;
    }

}