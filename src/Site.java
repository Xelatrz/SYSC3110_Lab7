public class Site {
    static public int TAX_RATE;

    public Site() {}

    public static double getBillableAmount(int _units, int _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = LifelineSite.getTaxAmount(base);
        return base + tax;
    }

    private static double getBaseAmount(int _units, int _rate, boolean lifelineTrue) {
        if (lifelineTrue) {
            return LifelineSite.getBaseAmount(_units, _rate);
        }
        return ResidentialSite.getBaseAmount(_units, _rate);
    }

    public static double getBillableAmount(int _units, int _rate) {
        double base = getAmount(_units, _rate);
        double tax = ResidentialSite.getTaxAmount(base);
        return base + tax;
    }

    private static int getAmount(int _units, int _rate) {
        return ResidentialSite.getBaseAmount(_units, _rate);
    }
}
