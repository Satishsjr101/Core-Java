import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class OpenYoutubeChannel {
    public static void main(String[] args) {
        String channelUrl = "https://www.youtube.com/channel/UC7_YxT-KID8kRbqZo7MyscQ";

        try {
            Desktop.getDesktop().browse(new URI(channelUrl));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
