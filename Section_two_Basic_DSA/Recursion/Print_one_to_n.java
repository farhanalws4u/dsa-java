class Print_one_to_n{

	static void Print(int n){   // auxiliary space O(n) and time complexity O(n)

		if(n!=1)
		Print(n-1);
		System.out.println(n);

	}

	static void print_gfg_approach(int n){
	
		if(n==0) return;
		print_gfg_approach(n-1);
		System.out.println(n);
	}

	public static void main(String args[]){
	
		int n = 5;
		Print(n);

	}

}
