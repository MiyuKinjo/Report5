import java.io.*;

public class Report5{
    public static void main(String[] args){
        try{
            String str = null;
        System.out.println(str);
        System.out.println(str.length());

        }catch(NullPointerException e){
            System.out.println("エラー発生！変数がnullだよ！" + e.getMessage());
        }

    }
}