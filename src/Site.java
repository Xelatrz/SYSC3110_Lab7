public class Site {
    static public int TAX_RATE;

    public Site() {}

    public static double getBillableAmount(int _units, int _rate) {
        double base = new LifelineSite().getBaseAmount(_units, _rate);
        double tax = new LifelineSite().getTaxAmount(base);
        return base + tax;
    }
}
