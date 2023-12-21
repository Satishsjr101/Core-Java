import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class _100ytchannel {
    public static void main(String[] args) throws java.lang.Error {
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
