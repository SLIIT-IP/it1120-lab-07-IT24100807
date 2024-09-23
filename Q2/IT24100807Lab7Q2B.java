public class IT24100807Lab7Q2B {
  public static void main (String[] args) {
    String star = "* ";
    int no = 5;
    for (int i = 1;i<=no;i++){
      System.out.println(i+" - "+star.repeat(i));
    }
  }
}