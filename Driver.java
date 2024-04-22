public class Driver {
    public static void main(String[] args) {
        // Create a sample currency graph
        CurrencyGraph currencyGraph = new CurrencyGraph();

        // Add some currency nodes and conversions to the graph (for testing purposes)
        currencyGraph.addCurrencyNode("US", 0.8, "EU");
        currencyGraph.addCurrencyNode("EU", 130, "YEN");
        currencyGraph.addCurrencyNode("YEN", 12, "LIRA");
        currencyGraph.addCurrencyNode("LIRA", 0.001, "US");

        currencyGraph.printAdjacencyList();
    }
}
