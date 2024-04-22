public class Conversion { // Acts as an EDGE node

    private String source;
    private String dest;
    private double conversionRate;

    public Conversion(String source, String dest, double conversionRate) {
        this.source = source;
        this.dest = dest;
        this.conversionRate = conversionRate;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public String getConvertsTo() {
        return dest;
    }

    public String getSourceOfConversion() {
        return source;
    }

}