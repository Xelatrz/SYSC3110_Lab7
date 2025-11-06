public class LifelineSite {

    public LifelineSite() {}

    public static double getBillableAmount(int _units, int _rate) {
        double base = new LifelineSite().getBaseAmount(_units, _rate);
        double tax = new LifelineSite().getTaxAmount(base);
        return base + tax;
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

    public double getBaseAmount(int _units, int _rate) {
        return _units * _rate * 0.5;
    }
}