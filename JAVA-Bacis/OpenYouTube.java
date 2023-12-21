import java.awt.Desktop;
import java.net.URI;

public class OpenYouTube {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com"));
            // Desktop.getDesktop().browse(new URI("https://www.fb.com"));

            Thread.sleep(1000); // Wait for 1 second before opening the next tab
        }
    }
}
