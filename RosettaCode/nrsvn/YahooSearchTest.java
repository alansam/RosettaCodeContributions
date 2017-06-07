
import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class YahooSearchTest {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException, IOException {
        // Create a new search
        YahooSearch search = new YahooSearch("Rosetta code");
        // Get the search results
        List<YahooResult> results = search.search();
        // Show the search results
        for (YahooResult result : results) {
            System.out.println(result.toString());
        }
    }
}

