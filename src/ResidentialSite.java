public class ResidentialSite {

    ResidentialSite() {}

    public double getBillableAmount(int _units, int _rate) {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
