public class ResidentialSite {

    ResidentialSite() {}

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    public int getBaseAmount(int _units, int _rate) {
        return _units * _rate;
    }
}
