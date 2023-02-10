package ConversionToJson;

import java.io.IOException;

public class UserTest {
    public static void main(String[] args) throws IOException {
        Сonversion conversion = new Сonversion();
        conversion.FlipTextFileToJson("TextFile", "OutPutTextFile.json");
    }

}


