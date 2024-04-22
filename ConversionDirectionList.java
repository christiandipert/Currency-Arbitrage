/**
 * Implementation of a generic singly linked list specialized for storing edges in an adjacency list.
 */
public class ConversionDirectionList {

    private CurrencyNode root;
    private String label;

    /**
     * Constructs an empty linked list.
     */
    public ConversionDirectionList(String label) {
        root = null;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public CurrencyNode getRoot() {
        return root;
    }
    
    /**
     * Constructs a linked list with a single edge as its root.
     * @param edge The edge to initialize the list with.
     */
    public ConversionDirectionList(Conversion conversion, String label) {
        root = new CurrencyNode(conversion, label);
    }
    
    /**
     * Adds a new edge to the end of the list.
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
     * Traverses the list to find the last node.
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