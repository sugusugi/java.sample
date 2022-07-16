import java.util.regex.*;

public class FizzBuzz{
  public static void main(String[] args) {
    //半角英数字で引数が1つじゃないと処理できないのでそれ以外は強制終了
    String regex = "\\D";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(args[0]);
    if(args.length != 1 || m.find()){
      System.out.println("半角の数字で引数を1つだけ指定してください");
      System.exit(0);
    }
    int no = 0;
    //String型のargsをint型に変更
    int noMax = Integer.parseInt(args[0]);
    for(int i = 0; i < noMax; i++){
      no += 1;
      //3の倍数の時
      if(no % 3 == 0){
        System.out.print("Fizz");
      }
      //5の倍数の時
      if(no % 5 == 0){
        System.out.print("Buzz");
      }
      //どちらでもないとき
      if(no % 5 != 0 && no % 3 != 0){
        System.out.print(no);
      }
      //最後の数字以外全角スペースで空ける
      if(no < noMax){
          System.out.print(" ");
      }
    }
  }
}
