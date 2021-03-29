import Device.TeaGasDevice;
import Manufacturer.DeviceFacotory;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        DeviceFacotory deviceFacotory = new DeviceFacotory();

        String packageName;
        String internetConnection;
        String serverOption;

        System.out.println("\nChoose A packageName among (Silver, Gold, Platinum, Diamond \n(Type the name please!)");
        Scanner in = new Scanner(System.in);
        packageName = in.nextLine();

        System.out.println("\nChoose Internet Connection Option among (WIFI, GSM, Ethernet)\n(Type the name please!)");
        internetConnection = in.nextLine();

        System.out.println("\nChoose a frameWork option among (Django, Spring, Laravel) \n(Type the name please!)");
        serverOption = in.nextLine();

        /**
         * deliver the device as chosen
         */

        System.out.println("\n\nProcessing......\n\n");

         TeaGasDevice TeaGasDevice  = deviceFacotory.getTeagas(packageName,serverOption,internetConnection);



    }
}
