import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Siv {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many numbers do you want to sift");
    int n = in.nextInt();
    int[] notPrime;
    notPrime = new int[n];
    
for(int start=2; start<=n; start++){
    for(int i=start+start; i<=n; i+=start){
        int j = i-start;
        notPrime[j] = i;
        System.out.println(notPrime[j]);
}
}
int[] Prime;
Prime = new int[n];
Answer[] = [Prime-notPrime];
if(int )

}
}
