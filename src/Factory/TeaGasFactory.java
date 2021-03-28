package Factory;

import Device.MicroController;
import builder.TeaGasBuilder;

public class TeaGasFactory {

    private static TeaGasBuilder  builder;

    public static MicroController getTeagas(String packageName){

        builder = new TeaGasBuilder();

        if (packageName.equals("Silver")){
            /**
             * Silver means Arduino
             */

            return builder.getSilver("","");

        }
        else if (packageName.equals("Diamond")){

            return builder.getSilver("","");

        }
        else if (packageName.equals("Gold")){

            return builder.getSilver("","");

        }
        else if (packageName.equals("Platinum")){
            return builder.getSilver("","");

        }
        else {
            return builder.getSilver("","");

        }
    }
}
