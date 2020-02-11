package hol.troll.poll;

public class Distance {
    static class Converter {
        public void KmToMi(double KM) {

        }
        public void MToKm(double M) {
            double result = M / 1000;
            System.out.println(result);
        }
        public void KmToM(double KM) {
            double result = KM * 1000;
            System.out.println(result);
        }
    }
    double distance;
    public void print() {
        System.out.println("print");
    }

}
