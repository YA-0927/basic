package ex;

import intro.order.If2;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import javax.swing.*;
import java.util.Scanner;

public class CalcBmi {
    static double inputDouble(String message){
        Scanner scanner = new Scanner (System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }
    public static void main(String[] args) {
        double h = inputDouble("身長を入力してください（単位 m）");
        double w = inputDouble("体重を入力してください（単位 kg）");
        //BMI=体重/身長*身長
        //適正体重＝身長*身長*22


        double b = w / Math.pow(h, 2);//BMI
        b = Math.round(b * 10.0) / 10.0;

        double t = Math.pow(h, 2) * 22;//適正体重
        t = Math.round(t * 10.0) / 10.0;

        double gosa = Math.round((w - t) * 10.0) / 10.0;

        double s = Math.pow(h, 2) * 18.5;//低体重
        s = Math.round((s) * 10.0) / 10.0;

        double f1 = Math.pow(h, 2) * 25;//肥満（1度）
        f1 = Math.round((f1) * 10.0) / 10.0;

        double f2 = Math.pow(h, 2) * 30;//肥満（2度）
        f2 = Math.round((f2) * 10.0) / 10.0;

        double f3 = Math.pow(h, 2) * 35;//肥満（3度）
        f3 = Math.round((f3) * 10.0) / 10.0;

        double f4 = Math.pow(h, 2) * 40;//肥満（4度）
        f4 = Math.round((f4) * 10.0) / 10.0;

        double mh = h * 1.08;//身長男体化
        mh = Math.round((mh) * 100.0) / 100.0;

        double mw = w * 1.31;//体重男体化
        mw = Math.round((mw) * 10.0) / 10.0;

        System.out.println("身長：" + h + "m");
        System.out.println("体重：" + w + "kg");
        System.out.println("BMI：" + b);//小数点第二位以下四捨五入
        System.out.println("適正体重：" + t + "kg");
        System.out.println("適正体重との誤差:" + gosa + "kg");
        System.out.println("低体重：～" +  s + "kg");
        System.out.println("肥満（1度）:" + f1 + "～" + (f2 -0.1) +"kg");
        System.out.println("肥満（2度）:" + f2 + "～" + (f3 -0.1) +"kg");
        System.out.println("肥満（3度）:" + f3 + "～" + (f4 -0.1) +"kg");
        System.out.println("肥満（4度）:" + f4 + "～kg");
        System.out.println("もし男の身長になったら…:" + mh + "m");//小数点第三位以下四捨五入
        System.out.println("もし男の体重になったら…:" + mw + "kg");

        //Ifにより体系表示ができるようにしてください
        System.out.print("判定：あなたは");
        if (b < 18.5) {//低体重
            System.out.print("やせすぎ");
        } else if (b < 25) {//普通体重
            System.out.print("普通体重");
        } else if (b < 30) {//肥満（１度）
            System.out.print("肥満（１度）");
        } else if (b < 35) {//肥満（２度）
            System.out.print("肥満（２度）");
        } else if (b < 40) {//肥満（３度）
            System.out.print("肥満（３度）");
        } else {//肥満（４度）
            System.out.print("肥満（４度）");
        }
        System.out.print("です");
    }
}
