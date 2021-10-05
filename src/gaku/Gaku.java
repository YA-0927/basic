package gaku;

import java.time.LocalDateTime;
import java.util.Random;

public class Gaku {
    public static void main(String[] args) {
        System.out.println("伏見、今日は何するのかな？");
        Random random = new Random(LocalDateTime.now().getSecond());
        int pattern = random.nextInt(5);
        System.out.print("どうやら、");
    if (pattern==0){
        System.out.print("パチンコをする");
    }else if (pattern==1) {
        System.out.print("バイトをする");
    }else if (pattern==2) {
        System.out.print("疲れたので寝る");
    }else if (pattern==3){
        System.out.print("大学に残って勉強をする");
    }else {
        System.out.print("配信をする");
    }
        System.out.println("みたいですね～");
    }
}
