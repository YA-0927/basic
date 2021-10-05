package intro.order;

//forを使った配列の処理
public class For2 {
    public static void main(String[] args) {
        int[] array ={20,30,10,50,40};//配列の宣言
        /*全部の要素を表示したい
        Tabキーを押すと配列のキーに移動します
        lengthは長さ　長さは5になる
         */
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
