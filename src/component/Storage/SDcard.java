package component.Storage;

public class SDcard {

   private Double size;
   private Double freeSpace;
   private Double usedSpace;



   public Double getFreeSpace() {
      return freeSpace;
   }

   public void setFreeSpace(Double freeSpace) {
      this.freeSpace = freeSpace;
   }

   public Double getUsedSpace() {
      return usedSpace;
   }

   public void setUsedSpace(Double usedSpace) {
      this.usedSpace = usedSpace;
   }

   void   setSize(Double size){

      this.size = size;

   }
   Double getSize(){
      return size;
   }


   public void setFunctionalities(){

   }
   public void setType(){

   }
   public void customize(){

   }

}
