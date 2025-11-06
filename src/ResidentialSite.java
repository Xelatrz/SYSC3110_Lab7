public class ResidentialSite {

    ResidentialSite() {}

    public static double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    public static int getBaseAmount(int _units, int _rate) {
        return _units * _rate;
    }
}
