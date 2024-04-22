public class Driver {
    public static void main(String[] args) {

        CurrencyGraph currencyGraph = new CurrencyGraph();

        currencyGraph.addCurrencyNode("1 US", 0.8, "EU");
        currencyGraph.addCurrencyNode("1 EU", 130, "YEN");
        currencyGraph.addCurrencyNode("1 YEN", 12, "LIRA");
        currencyGraph.addCurrencyNode("1 LIRA", 0.001, "US");
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        currencyGraph.printAdjacencyList();

        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
    }
}
