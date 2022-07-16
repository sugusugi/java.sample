public class ArgsLastPrinter{
  public static void main(String[] args){
      int cmdNo = args.length;
      //コマンドライン引数を何も指定しなかった場合args配列の要素数は０になるから。
      if(cmdNo == 0){
        System.out.println("なし");
      }else{
        //配列番号は0スタートなので要素数から-1する。
        System.out.println(args[cmdNo - 1]);
      }
  }
}
