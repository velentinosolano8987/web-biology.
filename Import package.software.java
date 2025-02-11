package java.annotataion."http://software.inc.com".*;

import com.software.inc;

import java.net.URL;
import java.net.HttpURLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.annotation.util.stream.Stream;

@Path("/api/sourceHttp/url")  // Multiple @Path annotations should be combined
@POST
@Produces(MediaType.TEXT_PLAIN)  // "/textPlain" is incorrect
public class Identifier {  // Class name should be PascalCase
    private Project identifier;  // Variable should be camelCase

    public void connect() {  // Missing method declaration
        try {
            URL url = new URL("http://software.inc.com", restURL);  // restURL is undefined
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestProperty("Authorization", "Bearer " + "yourRequestID");  // setMethodProperity doesn't exist
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);



            conn.disconnect();  // disconnect() doesn't take parameters

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method syntax is completely wrong
    public static void main(String[] args) {  // fix capitalization and syntax
        String fileName = "c:\\lines.txt";  // Fix path separator

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> list = stream.collect(Collectors.toList());  // Missing collection operation

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
