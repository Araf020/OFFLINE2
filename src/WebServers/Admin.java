package WebServers;

public class Admin  {

    private  String name;
    private FrameWorks frameWork;

    public Admin(){
        /**
         * your constructor
         */
        frameWork = new Django();  /** by default: Django is set */

        System.out.println("Admin provided");
    }

    /**
     * implement below methods as needed
     */

    public void AnalyzeData(){
        /**
         *
         */
    }

    public void getData(){
        /**
         *
         */
    }

    public void removeLeafCollector(String name){
        /**
         *
         */
    }

    public void setFrameWork(String frameWorkname){

        /**
         *
         */
        if (frameWorkname.toUpperCase().equals("SPRING")){
            frameWork = new Spring();
        }
        else if (frameWorkname.toUpperCase().equals("LARAVEL")){
            frameWork = new Laravel();
        }

        else
            frameWork = new Django();
    }


    public FrameWorks getFrameWork(){
        return this.frameWork;
    }



    void setName(){

    }

    String getName(){
        return name;
    }
}
