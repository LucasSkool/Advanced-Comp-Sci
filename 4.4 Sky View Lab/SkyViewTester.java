public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned1 = new double[]{0.3, 0.7, 0.8, 0.4};
        SkyView jan25th = new SkyView(2, 2, scanned1);
        System.out.println(jan25th.toString());

        System.out.println();

        double[] scanned2 = new double[]{0.3};
        SkyView jan24th = new SkyView(1, 1, scanned2);
        System.out.println(jan24th.toString());

        System.out.println();

        double[] scanned3 = new double[]{0.3, 0.7, 0.8, 0.4, 0.5, 0.2,
            0.6, 0.9, 0.1, 0.2, 0.5, 0.7};
        SkyView jan23rd = new SkyView(4, 3, scanned3);
        System.out.println(jan23rd.toString());

        System.out.println();
        
        try {
            double[] scanned4 = new double[]{0.3, 0.7, 0.8, 0.4};
            SkyView jan22nd = new SkyView(2, 3, scanned4);
            System.out.println(jan22nd.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sectional average of Jan 23rd: " + jan23rd.getAverage(1, 2, 0, 1));
        
        

    }
}
