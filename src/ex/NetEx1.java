package ex;

public class NetEx1 {
    public static void main(String[] args) {
        int values[] =new int[10] ;

        for (int i = 0; i < 10 ; i++)
            values[i]= Integer.parseInt(br.readLine());

        System.out.println();

        for (int i = 0; i <10 ; i++) {
            System.out.println(values[i]*2);
        }
    }
    }

