package ex;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

//じゃんけん
public class Rps {
    public static void main(String[] args) {
        //乱数の発生
        Random random = new Random(LocalDateTime.now().getSecond());
        int cpu = random.nextInt(3);//0,1,2の三種類の値が発生する

        //プレイヤーの手の入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの手を選んでください");
        System.out.println("0.グー 1.チョキ 2.パー");
        int player = scanner.nextInt();

        //CPUの手を表示
        switch (cpu) {
            case 0:
                System.out.println("CPU:グー");
                break;
            case 1:
                System.out.println("CPU:チョキ");
                break;
            case 2:
                System.out.println("CPU:パー");
                break;
        }

        //あなたの手を表示
        switch (player) {
            case 0:
                System.out.println("あなた:グー");
                break;
            case 1:
                System.out.println("あなた:チョキ");
                break;
            case 2:
                System.out.println("あなた:パー");
                break;
        }

        //勝敗の結果表示

        //if文は真偽値の変数か、結果がbooleanになる式しか書くことができない
        if ((player)==(cpu)){
            System.out.println("あいこです");
        }else if((player)==0&&(cpu)==1){
            System.out.println("あなたの勝ちです");
        }else if((player)==1&&(cpu)==2){
            System.out.println("あなたの勝ちです");
        }else if((player)==2&&(cpu)==0){
            System.out.println("あなたの勝ちです");
        }else{
            System.out.println("あなたの負けです");
        }

        /*
        あなたの勝ちですは
        }else if(((comA == 0) && (comB == 1)) || ((comA == 1) && (comB == 2)) || ((comA == 2) && (comB == 0))){
        で示すこともできる
         */
    }
}