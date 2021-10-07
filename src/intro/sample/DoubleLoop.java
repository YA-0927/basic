package intro.sample;

//二重ループ
public class DoubleLoop {
    public static void main(String[] args) {
        //二次元配列(配列の中に配列があるイメージ/かっこが二つあるから二次元配列)
        int[][] array= {//二次元配列がからカッコが二つある
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // 場所を指定するときは[縦][横]で指定
        System.out.println(array[0][2]);//3
        System.out.println(array[2][0]);//7

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //こここのiとjが変わるだけで順番が大きく変わる！
                System.out.println(array[j][i]);
            }

        }
    }
}
