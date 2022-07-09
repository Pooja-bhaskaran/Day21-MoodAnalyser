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

    protected static String analyzeMood2(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else if (message.contains("I am in Happy mood")) {
            return "HAPPY";
        } else {
            return "null";
        }
    }

    protected static String analyzeMood3(String message) {
        try {
            if (message.contains("sad")){
                return "SAD";
            }
        }
        catch (NullPointerException e){
            return "Happy";
        }
        return "null";
    }
}
