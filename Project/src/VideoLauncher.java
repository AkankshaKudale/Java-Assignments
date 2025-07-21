import java.util.ArrayList;
import java.util.Scanner;

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true;
    }

    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}


class VideoStore {
    private ArrayList<Video> store = new ArrayList<>();

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------");
        System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
        for (Video v : store) {
            System.out.println(v.getName() + "\t\t|\t" + v.getCheckout() + "\t\t|\t" + v.getRating());
        }
        System.out.println("--------------------------------------------------");
    }
}
public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1..6): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video to add: ");
                    String addName = sc.nextLine();
                    vs.addVideo(addName);
                    break;

                case 2:
                    System.out.print("Enter the name of the video to check out: ");
                    String checkoutName = sc.nextLine();
                    vs.doCheckout(checkoutName);
                    break;

                case 3:
                    System.out.print("Enter the name of the video to return: ");
                    String returnName = sc.nextLine();
                    vs.doReturn(returnName);
                    break;

                case 4:
                    System.out.print("Enter the name of the video to rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    sc.nextLine();
                    vs.receiveRating(rateName, rating);
                    break;

                case 5:
                    vs.listInventory();
                    break;

                case 6:
                    System.out.println("Thank you for using the Video Rental Inventory System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
