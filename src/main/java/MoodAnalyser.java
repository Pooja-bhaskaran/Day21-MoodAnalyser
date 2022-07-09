public class MoodAnalyser {

    public static String analyzeMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return "null";
        }
    }
}
