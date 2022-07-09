import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest extends MoodAnalyser{

    @Test
    void givenMessage_whenSad_shouldReturnSad(){
        String result = MoodAnalyser.analyzeMood("sad");
        assertEquals("SAD",result);
    }

}
