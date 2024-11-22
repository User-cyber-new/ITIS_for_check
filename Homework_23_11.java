import java.lang.Math;
import java.util.Scanner;


class Homework_23_11{
	public static void per(){ // из 10 в k
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();

		int n = scanner.nextInt();
		int len = 0;
		int number = 0;

		while (n > 0){
			number+= (n%k)*Math.pow(10, len);
			n/=k;
			len++;
		}

		System.out.println(number);
	}

	private static int getLen(int number, int osn){
		int k = 0;

		while (number > 0){
			number/= osn;
			k++;
		}
		return k;
	}

	public static void ex1(){ // из 10 в k
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();

		int n = scanner.nextInt();
		
		int num = 0;

		int chet = getLen(n, k);

		while (n > 0){
			int razryd = ( (int) Math.pow(k, (chet - 1) ) * ( (int )(n / Math.pow(10, (chet - 1) ) ) )  );
			num+=razryd;
			n %= Math.pow(10, chet - 1);
			chet--;
		}

		System.out.println(num);

	}

	public static void ex2(){
		Scanner scanner = new Scanner(System.in);
		int next, last, now, num;

		num = scanner.nextInt();
		last = num;
		
		num = scanner.nextInt();
		now = num;

		num = scanner.nextInt();
		next = num;

		int k = 0;
		//  выход из ввода последовательности - не интовый символ

		while (true){
			if ( (now > last) && (now > next) ){
				k++;
			}
			last = now;
			now = next;
			try{
				next = scanner.nextInt();
			}
			catch(Exception e){

				System.out.println("local maximum " + k);
				break;
			}
			

		}
	}

	public static void ex3(){
		final double PI = 3.141592653589793;

		Scanner scanner = new Scanner(System.in);
		
		double m = scanner.nextDouble();
		double n = scanner.nextDouble();

		if ( (Math.abs(PI - m/n ) < Math.abs(PI - n/m)) ){
			m*=10;
			System.out.println(m);
		}
		else{
			n*=2;
			System.out.println(n);
		}


	}


	private static boolean isChet(int num){
		while (num > 0){
			int razryd = num % 10;
			if (razryd % 2!= 0) return false;
			num/=10;
		}
		return true;
	}

	private static boolean isNeChet(int num){
		while (num > 0){
			int razryd = num % 10;
			if (razryd % 2 == 0) return false;
			num/=10;
		}
		return true;
	}

	public static void ex4(){
		Scanner scanner = new Scanner(System.in);

		int k = 0;

		int number = scanner.nextInt();

		while (true){
			if( ( (getLen(number, 10) == 3) || (getLen(number, 10) == 5) ) && ( isChet(number) || isNeChet(number) ) ){
				k++;
			}

			try{
				number = scanner.nextInt();
			}

			catch(Exception e){
				System.out.println("kol-vo: " + k);
				break;
			}

		}
	}
	public static void ex5(){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println("Enter nums: ");

		double[] arr = new double[n];

		for (int i = 0; i < n; i++){
			double number = scanner.nextDouble();

			if (number < 0) number+=0.5;

			else {number = 0.1;}
		
			arr[i] = number;
		}

		System.out.println();

	for (double num: arr){
		System.out.println(num);
	}

	}

	public static void ex6_A(){
		double sum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter n: ");
		int n = scanner.nextInt();

		double stepen;

		System.out.println("enter a: ");
		double a = scanner.nextDouble();

		for (int i = 0; i <= n; i++){

			stepen = Math.pow( (double)2, (double)i);
			a = Math.pow(a, stepen);

			sum += (1/a);

		}

		System.out.println(sum);

	}

	public static void ex6_B(){
		double proizved = 1;

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter n: ");
		int n = scanner.nextInt();

		System.out.println("enter a: ");
		int a = scanner.nextInt();

		for (int i = 0; i <= n; i++){
			proizved *= (a - i*i);
		}

		System.out.println(proizved);
	}

	private static int sumDigits(int num){
		int sum = 0;

		while (num > 0){
			sum += (num % 10);
			num/=10;
		}
		return sum;
	}

	public static void ex7(){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		System.out.println("a) Len digits " + getLen(n, 10));
		System.out.println("б) sum digits " + sumDigits(n));
		System.out.println("в) first digit " + (int) (n / Math.pow(10, getLen(n, 10) - 1)) );
		System.out.println("г) last digit " + n%10);

	}

	public static void ex8(){
		// a[0]=1, a[1]=-3, a[2]=5, a[3]=-7
		int[] array = new int[]{1, -3, 5, 7};

		for (int n: array){
			System.out.println(n);
		}

	}

	public static void ex9_B(){
		Scanner scanner = new Scanner(System.in);

		double x = scanner.nextDouble();
		double y;

		if (x <= 0){
			y = (double)0;
		}

		else if ( (x > 0) && (x <= 1) ){
			y = (double) x;
		}


		else {y = (double)x*x*x*x;}


		System.out.println(y);
	}


	public static void ex9_G(){
		Scanner scanner = new Scanner(System.in);

		double x = scanner.nextDouble();
		double y;

		if (x <= 0) y = (double)0;
		else if ((x > 0) && (x <= 1)) y = (double)(x*x - x);

		else {y = (x*x - Math.sin(x*x * Math.PI)); }

		System.out.println(y);
	}

	public static void ex10(){
		//  процессе
	}



	public static void main(String[] args) {
		ex9_G();
	}
}