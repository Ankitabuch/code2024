package april30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
public static void main(String[] args) throws InterruptedException {
   Thread.sleep(1000);

   File file = new File("notify.txt");
   try{
       Scanner scanner = new Scanner(file);
   } catch (FileNotFoundException e){
       throw new RuntimeException(e);
   }
  }
}
