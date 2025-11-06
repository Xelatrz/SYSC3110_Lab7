public class ResidentialSite {

    ResidentialSite() {}

    private static double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    private static int getBaseAmount(int _units, int _rate) {
        return _units * _rate;
    }
}
