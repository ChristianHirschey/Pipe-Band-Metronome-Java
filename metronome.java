import java.util.*;
import java.lang.Thread;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Type MSR or Medley");
String set = sc.nextLine();
    
    if(set.equals("MSR")){
    System.out.println("How many parts is your march?");
    int marchLength = (sc.nextInt() * 32) + 10;
    System.out.println("What tempo is your march?");
    int marchTempo = sc.nextInt();
// 4 beats for tempo, 8 for attack roll - 1 at end for strath transition and -1 cuz inclusive, 32 per part
      
    System.out.println("How many parts is your strathspey?");
    int strathLength = (sc.nextInt() * 32) + 1;
    System.out.println("What tempo is your strathspey?");
    int strathTempo = sc.nextInt();

    System.out.println("How many parts is your reel?");
    int reelLength = (sc.nextInt() * 16) - 1;
    System.out.println("What tempo is your reel?");
    int reelTempo = sc.nextInt();

    int marchSleep = 60000 / marchTempo;
    int strathSleep = 60000 / strathTempo;
    int reelSleep = 60000 / reelTempo;
    try {
      for (int m = 0; m <= marchLength; m++) {
        System.out.print("|||");
        Thread.sleep(marchSleep);
      }
      for (int s = 0; s <= strathLength; s++) {
        System.out.print("///");
        Thread.sleep(strathSleep);
      }
      for (int r = 0; r <= reelLength; r++) {
        System.out.print("!!!");
        Thread.sleep(reelSleep);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
    else if(set.equals("Medley")){
      System.out.println("How many parts is your opener?");
      int openLength = (sc.nextInt() * 32) + 9; //32 per part + 12 for tempo -2 for jig trans inclusive
      System.out.println("What tempo is your opener?");
      int openTempo = sc.nextInt();
      
      System.out.println("How many parts of jigs does your set have?");
      int jigLength = sc.nextInt() * 32; //32 per part plus one for trans
      System.out.println("What tempo are your jigs?");
      int jigTempo = sc.nextInt();
      System.out.println("How many extra beats do your jigs have?");
      jigLength += sc.nextInt();
      
      System.out.println("How many beats is your slow air?");
      int slowLength = sc.nextInt();
      System.out.println("What tempo is your slow air?");
      int slowTempo = sc.nextInt();
      
      System.out.println("How many parts of strathspeys does your set have?");
      int strLength = (sc.nextInt() * 32) + 1; //32 per part plus four for trans
      System.out.println("What tempo are your strathspeys?");
      int strTempo = sc.nextInt();
      
      System.out.println("How many parts are your reels?");
      int rlLength = (sc.nextInt() * 16);
      System.out.println("What tempo are your reels?");
      int rlTempo = sc.nextInt();

      int openSleep = 60000 / openTempo;
      int jigSleep = 60000 / jigTempo;
      int slowSleep = 60000 / slowTempo;
      int strSleep = 60000 / strTempo;
      int rlSleep = 60000 / rlTempo;

    try {
      for(int o = 0; o <= openLength; o++){
        System.out.print("|||");
        Thread.sleep(openSleep);
      }

      for(int j = 0; j <= jigLength; j++){
        System.out.print("///");
        Thread.sleep(jigSleep);
      }
        
      for(int p = 0; p <= slowLength; p++){
        System.out.print("!!!");
        Thread.sleep(slowSleep);
      }

      for(int c = 0; c <= strLength; c++){
        System.out.print("+++");
        Thread.sleep(strSleep);
      }

      for(int r = 0; r <= rlLength; r++){
        System.out.print("\\\\\\");
        Thread.sleep(rlSleep);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    }
    else System.out.println("Not a valid set type");
}
}

