public class ResidentialSite {

    ResidentialSite() {}

    public static double getBillableAmount(int _units, int _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private static double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    private static int getBaseAmount(int _units, int _rate) {
        return _units * _rate;
    }
}
