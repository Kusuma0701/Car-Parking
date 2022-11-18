import java.util.Arrays;
import java.util.Scanner;

public class CarParkingRunner
{
    public static void main(String[] args) {
        //CarParking entry = new CarParking();
        CarParking exits = new CarParking();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean d;
        int i = 0, b = 0;
        int a[] = new int[n];//slot No
        int r[] = new int[n];
        String[] carNo = new String[n];
        String[] color = new String[n];
        System.out.println("Created a parking lot with "+n+ " slots");
        System.out.print("Please enter true for entering and false for exiting");
        d=sc.nextBoolean();
        if(d)
        {
            while (i < n) {
                for (i = 0; i < n; i++) {
                    a[i]=i+1;
                    System.out.println("Enter Car Number Plate :");
                    carNo[i] = sc.next();
                    System.out.println("Enter Car Color");
                    color[i] = sc.next();
                    System.out.println("---------");
                    System.out.println("Slot No--" + (a[i]));
                    System.out.println("CarNo---" + (carNo[i]));
                    System.out.println("Color---" + (color[i]));
                    System.out.println("---------");
                    System.out.println("Remaining Slot"+Arrays.toString(a));
                    System.out.println("");
                    //entry.detail(a, carNo, color);
                }
                System.out.println("Slot No.     Registration No.         Color ");
                for(int j=0;j<n;j++)
                {
                    System.out.println("   "+a[j]+"     "+carNo[j]+"         "+color[j]);
                }
                System.out.println("Sorry, parking lot is full");

            }
            if(i>n)
            {
                exits.remainingSlot(n,r);
                System.out.println(Arrays.toString(r));
                if(r[0]!=0)
                {
                    for (int f = 0,e=0; f < r.length; f++)
                    {
                        e=r[f];
                        carNo[e] = sc.next();
                        color[e] = sc.next();
                        System.out.println("---------");
                        System.out.println("Slot No--" + (e));
                        System.out.println("CarNo---" + (carNo[e]));
                        System.out.println("Color---" + (color[e]));
                        System.out.println("---------");
                       // entry.detail(a, carNo, color);
                    }
                }
            }
        }
        else
        {
            b=sc.nextInt();
            System.out.println("Slot number "+b+" is free");
            exits.removeSlot(b);
            exits.remainingSlot(n,r);
            System.out.println(Arrays.toString(r));
        }

    }


}

