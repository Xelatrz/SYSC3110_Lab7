public class Site {
    static public int TAX_RATE;

    public Site() {}

    public static double getBillableAmount(int _units, int _rate, boolean lifelineTrue) {
        double base = getBaseAmount(_units, _rate, lifelineTrue);
        double tax = getTaxAmount(base, lifelineTrue);
        return base + tax;
    }

    private static double getTaxAmount(double base, boolean lifelineTrue) {
        if (lifelineTrue) {
            return LifelineSite.getTaxAmount(base);
        }
        return ResidentialSite.getTaxAmount(base);
    }

    private static double getBaseAmount(int _units, int _rate, boolean lifelineTrue) {
        if (lifelineTrue) {
            return LifelineSite.getBaseAmount(_units, _rate);
        }
        return ResidentialSite.getBaseAmount(_units, _rate);
    }
}
