public class LifelineSite {

    public LifelineSite() {}

    public double getBillableAmount(int _units, int _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private static double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

    private static double getBaseAmount(int _units, int _rate) {
        return _units * _rate * 0.5;
    }
}