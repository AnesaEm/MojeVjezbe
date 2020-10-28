package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
	public static int sumaCifara(int br){
		int suma=0,pom=br;
		while(pom!=0){
			if (br<10)
				return  br;
			suma+=pom%10;
			pom/=10;

		}
		return suma;
	}
    public static void main(String[] args) {
	int n,sum;
	System.out.printf("Unesite broj n: ");
	Scanner ulaz=new Scanner(System.in);
	n=ulaz.nextInt();
	for(int i=1;i<=n;i++){
		sum=sumaCifara(i);
	    if(i%sum==0){
            System.out.println(i);
        }

    }
    }
}
