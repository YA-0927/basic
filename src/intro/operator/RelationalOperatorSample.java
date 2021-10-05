package intro.operator;

public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = -51;

        //numが0以上である（numのほうが大きい＞）
        System.out.println(num >= 0);
        //numが100以下である（numのほうが小さい＜）
        System.out.println(num <= 100);
        //numが奇数である（２で割った余りが１である）＝idiom
        System.out.println(num % 2 == 1);
        //numが3の倍数である
        System.out.println(num % 3 == 0);

        //numが0以上かつ100以下
        System.out.println(num >= 0 && num <=100);
        System.out.println(!(num < 0 || num > 100));//否定：０より小さく、100より大きい）
    }
}
