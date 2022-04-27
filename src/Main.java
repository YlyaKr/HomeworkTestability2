public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassKilograms = 72.5;
        double heightMeters = 1.73;

        double bodyMassIndex = service.calculate(bodyMassKilograms, heightMeters);
        System.out.println("Индекс массы тела равен: " + String.format("%.2f", bodyMassIndex));
    }
}
