/**
     * Inner class representing a node in the linked list storing an edge.
     */
    class CurrencyNode { // Stores the current country/currency

        private Conversion conversion;
        private String label;
        private CurrencyNode next;

        /**
         * Constructs a currency node, representing a node in the graph with a
         * conversion as an edge and the node label.
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