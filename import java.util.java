import java.util.Scanner;

public class ClimatePredictionAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parameters
        System.out.println("=== Climate Prediction Analysis System ===");
        System.out.print("Enter average temperature (°C): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter average humidity (%): ");
        double humidity = scanner.nextDouble();

        System.out.print("Enter average rainfall (mm): ");
        double rainfall = scanner.nextDouble();

        // Analyze and predict
        String climateCondition = predictClimate(temperature, humidity, rainfall);

        // Output result
        System.out.println("\nClimate Analysis Result:");
        System.out.println("Predicted Climate Condition: " + climateCondition);

        scanner.close();
    }

    // Logic to analyze climate data
    public static String predictClimate(double temp, double humidity, double rain) {
        if (temp > 35 && humidity < 40) {
            return "Hot and Dry";
        } else if (temp >= 25 && temp <= 35 && humidity > 60 && rain > 100) {
            return "Humid and Rainy";
        } else if (temp < 15 && humidity > 50) {
            return "Cold and Moist";
        } else if (rain > 200) {
            return "Heavy Rainfall Warning";
        } else {
            return "Moderate Climate";
        }
    }
}
