public class MoodAnalyser {

    protected static String analyzeMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return "null";
        }
    }

    protected static String analyzeMood1(String message) {
        if (message.contains("I am in sad mood")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return "null";
        }
    }
}
