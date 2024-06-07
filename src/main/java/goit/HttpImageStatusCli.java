package goit;

import java.util.Scanner;

public class HttpImageStatusCli {

    void askStatus() {

        HttpStatusImageDownloader imageDownloader = new HttpStatusImageDownloader();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            boolean correctInput = true;
            System.out.println("Enter HTTP status code");
            int userInput;

            while (correctInput) {

                if (scanner.hasNextInt()) {
                    userInput = scanner.nextInt();
                    try {
                        imageDownloader.downloadStatusImage(userInput);
                        System.out.println("Image " + userInput + ".jpg downloaded");
                    } catch (NoImageFound e) {
                        System.out.println("There is not image for HTTP status " + userInput);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    if (scanner.next().equals("exit")) {
                        System.exit(0);
                    } else {
                        System.out.println("Please enter valid number");
                        continue;
                    }
                }
                correctInput = false;
            }
        }
    }
}
