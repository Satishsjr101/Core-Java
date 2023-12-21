import java.awt.Desktop;
import java.net.URI;

public class OpenYouTube1000 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com"));
            Thread.sleep(1000); // Wait for 1 second before opening the next tab
        }
    }
}
