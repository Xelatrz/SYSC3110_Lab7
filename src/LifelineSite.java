public class LifelineSite {

    public LifelineSite() {}

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

    public double getBaseAmount(int _units, int _rate) {
        return _units * _rate * 0.5;
    }
}