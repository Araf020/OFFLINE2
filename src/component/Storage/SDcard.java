package component.Storage;

public class SDcard {

   private Double size;
   private Double freeSpace;
   private Double usedSpace;

   public SDcard() {

      System.out.println("SDcard set");
   }

   public void setFunctionalities(){

      sdCardStorage sdCardStorage = new sdCardStorage() {
         @Override
         public void setSize() {

         }

         @Override
         public void increaseSize() {

         }

         @Override
         public void FileDeletion() {

         }

         @Override
         public void FileRetrieve() {

         }

         @Override
         public void setFolders() {

         }

         @Override
         public void copyData() {

         }
      };

   }


   public void setType(){

   }
   Double getSize(){
      return size;
   }
   public void customize(){

   }

}
