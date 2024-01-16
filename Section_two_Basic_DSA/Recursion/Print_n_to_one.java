class Print_n_to_one{

	static void printNum(int n){
		
		if(n==0) return;
		System.out.println(n);
		printNum(n-1);
	
	}

	public static void main(String args[]){
		
		int n=5;
		printNum(n);
	
	}

}
