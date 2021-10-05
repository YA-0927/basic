package omikuji;

import java.time.LocalDateTime;
import java.util.Random;

public class Omikuji {
    public static void main(String[] args) {
        System.out.println("あなたの運勢は～！");
        //大吉5％・中吉20％・吉50％・凶20％・大凶5％
        Random random = new  Random(LocalDateTime.now().getSecond());
                int num =random.nextInt(100);
        if (num < 5){
            System.out.println("大吉");
        } else if (num < 25) {
            System.out.println("中吉");
        }else if (num < 75) {
            System.out.println("吉");
        }else if (num < 95) {
            System.out.println("凶");
        } else {
            System.out.println("大凶");
        }
        System.out.println("尚何回でもやり直しができる!毎日大吉！");
    }
}
