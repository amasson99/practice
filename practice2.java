public class practice2{
  public static void main(String [] args){
    int total = 0;
    int prev = 0;
    int i = 0;
    /*for (i = 0; i <= 1000; i = i + 2){
      prev = i;
      total += prev;
    }*/
    do{
      i += 2;
      prev = i;
      total += i;

    }while(i<= 1000);
    System.out.println(total);

  }
}
