import java.util.Scanner;

class BookMyshow {
    private String move_name;
    private String thetre_name;
    private int cost;
    void movies() {     
        System.out.println("the movies available are");
        System.out.println(" 1.shreak -------- Rs.140 \n 2.stuart little - Rs.150 \n 3.game movie ---- Rs.100 \n 4.fun movie ----- Rs.100 ");     
    }
}

class thea extends BookMyshow {
private int no_f_tickets;
    void th() {
        System.out.println("*******the theaters available are******* \n 1.PVR th \n 2.CARNIVAL th");
        int k;
        int an;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("*******PVR theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 1.shreak \n 2.stuart little ");
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("shreak movie @ PVR theater");
                System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=140*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- PVR theater");
                    System.out.println("movie --------------------- shreak");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }
            }
            if (o == 2) {
                System.out.println("stuart little @PVR theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=150*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- PVR theater");
                    System.out.println("movie --------------------- staurt little");
                    System.out.println("cost ---------------------- Rs"+amount);
                    System.out.println("******************************************************");
                }
            }
        }
        if (n == 2) {
            System.out.println("*******CARNIVAL theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 3.game movie \n 4.fun movie");
            Scanner b = new Scanner(System.in);
            int p = b.nextInt();
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("game movie @ CARNIVAL theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=100*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- CARNIVAL theater");
                    System.out.println("movie --------------------- game movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }
            }
            if (o == 2) {
                System.out.println("fun little @CARNIVAL theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=100*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("theater ------------------- CARNIVAL theater");
                    System.out.println("movie --------------------- fun movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
        }

    }
}

public class labfr {
    public static void main(String[] args) {
	int f;
        BookMyshow ob = new BookMyshow();
        BookMyshow[] moviename = new BookMyshow[2];
        moviename[0] = ob;
        thea a = new thea();
        moviename[1] = a;
        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");
        Scanner d = new Scanner(System.in);
        int h = d.nextInt();
	do {
        switch (h) {
            case 1: {
                ob.movies();
                break;
            }
            case 2: {             
                a.th();
            }
        }
      }while(f==1);
    }
}
