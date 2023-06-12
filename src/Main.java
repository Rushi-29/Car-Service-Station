import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner sc=new Scanner(System.in);
//        String carType = sc.next();
//        int n=sc.nextInt();
//        String [] serviceCodes=new String[n];
//        for(int i=0;i<n;i++){
//            serviceCodes[i]=sc.next();
//        }

//        Hatchback
//        2
//        [BS01]
//        [EF01]
        CarServiceStation serviceStation = new CarServiceStation();
        String carType = "Hatchback";
        String[] serviceCodes = {"BS01", "EF01"};
//        String carType = "Sedan";
//        String[] serviceCodes = {"BS01", "CF01"};

        int totalBill = serviceStation.calculateBill(carType, serviceCodes);

        System.out.println("Type of Car: " + carType);
        System.out.println("Service Codes: " + String.join(", ", serviceCodes));
        System.out.println("Total Bill: ₹ " + totalBill);

        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning included");
        }

    }
}