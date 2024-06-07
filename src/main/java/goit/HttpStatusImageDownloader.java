package goit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class HttpStatusImageDownloader {

    private final HttpStatusChecker statusChecker;

    public HttpStatusImageDownloader() {
        statusChecker = new HttpStatusChecker();
    }

    void downloadStatusImage(int code) throws URISyntaxException, IOException, NoImageFound {

        URI uri = new URI(statusChecker.getStatusImage(code));
        URL url = uri.toURL();

        try (FileOutputStream fos = new FileOutputStream(code + ".jpg")) {
            ReadableByteChannel rbc = Channels.newChannel(url.openStream());
            FileChannel fileChannel = fos.getChannel();
            fileChannel.transferFrom(rbc, 0, Long.MAX_VALUE);
        }
    }
}
