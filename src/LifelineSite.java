public class LifelineSite {

    public LifelineSite() {}

    public double getBillableAmount(int _units, int _rate) {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}