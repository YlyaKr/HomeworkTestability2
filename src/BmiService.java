public class BmiService {
    public double calculate(double mass, double height) {
        double bodyMassIndex = mass / Math.pow(height, 2);
        return bodyMassIndex;
    }
}
