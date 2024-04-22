/**
     * Inner class representing a node in the linked list storing an edge.
     */
    public class CurrencyNode { // Stores the current country/currency

        private Conversion conversion;
        private String label;
        private CurrencyNode next;

        /**
         * Constructs a node with the given edge and null next pointer.
         * @param conversion The edge to be stored in the node.
         */
        public CurrencyNode(Conversion conversion, String label) {
            this.conversion = conversion;
            this.label = label;
            this.next = null;
        }

        public String getLabel() {
            return label;
        }

        public CurrencyNode getNext() {
            return next;
        }

        public Conversion getConversion() {
            return conversion;
        }

        public void setNext(CurrencyNode node) {
            next = node;
        }

    }