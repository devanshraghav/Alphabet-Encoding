import java.util.Scanner;
public class ENC_DEC{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no from 1 to 3");
int n = sc.nextInt();
if(n==1){
 System.out.println("the algorithm for encoding and decoding is playfair cipher");
 PlayfairCipher.main(args);
}
else if(n==2){
 System.out.println("the algorithm for encoding and decoding is RailFence");
 RailFence.main(args);
}
else if(n==3){
System.out.println("the algorithm for encoding and decoding is caesarcipher");
 CaesarCipherJava.main(args);
}
else{
System.out.println("invalid error");
}
}
}




