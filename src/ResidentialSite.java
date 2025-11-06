public class ResidentialSite {

    ResidentialSite() {}

    public double getBillableAmount(int _units, int _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    private static int getBaseAmount(int _units, int _rate) {
        return _units * _rate;
    }
}
