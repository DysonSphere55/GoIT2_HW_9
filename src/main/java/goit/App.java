package goit;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, NoImageFound {
//        HttpStatusChecker statusChecker = new HttpStatusChecker();
//        System.out.println(statusChecker.getStatusImage(10000));

//        HttpStatusImageDownloader imageDownloader = new HttpStatusImageDownloader();
//        imageDownloader.downloadStatusImage("301");

        HttpImageStatusCli cli = new HttpImageStatusCli();

        cli.askStatus();
    }
}
