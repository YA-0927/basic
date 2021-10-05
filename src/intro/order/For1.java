package intro.order;

public class For1 {
    public static void main(String[] args) {
        int sum =0;//合計の初期化
        /*
        入力補助機能のお話
        forって打ち込むとforeach,foriはforiで打ち込むと繰り返し処理は出てきてくれます
         */

        for (int i = 1; i <=100 ; i++) {
        sum+=i;
        System.out.println(1+"回目"+sum);

        }
    }
}
