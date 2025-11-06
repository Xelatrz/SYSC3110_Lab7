public class LifelineSite {

    public LifelineSite() {}

    public double getBillableAmount(int _units, int _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

    private static double getBaseAmount(int _units, int _rate) {
        return _units * _rate * 0.5;
    }
}