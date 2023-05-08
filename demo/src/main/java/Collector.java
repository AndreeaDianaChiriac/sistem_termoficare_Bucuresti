import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.lang.annotation.Documented;

public class Collector {

    public static String URL = "https://www.cmteb.ro/functionare_sistem_termoficare.php";

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public void collectData() throws IOException {

        Document pageToParse = Jsoup.connect(URL)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
                .header("Accept-Language", "*")
                .get();


    }

    /* ----------------------------------------------------------------------------------------- */

    public void parsePage(){

    }

}
