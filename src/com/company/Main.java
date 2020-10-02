package com.company;

public class Main {

    public static void main(String[] args) {
		int Lemon[][] = new int[3][4];
	for(int i=0;i<3;i++){
	    Lemon[i][0]=1;
	    Lemon[i][1]=2;
	    Lemon[i][2]=3;
	    System.out.println(Lemon[i][0]);
	    for(int x=0;x<4;x++){
	        Lemon[0][x]=4;
	        Lemon[1][x]=5;
	        Lemon[2][x]=6;
            System.out.println(Lemon[i][x]);
        }
    }

		int LemonSqueeze[] = {11, 10, 13};
		int LemonDrop[] = LemonSqueeze.clone();

		for (int i=0; i<LemonDrop.length; i++){
			System.out.println(LemonDrop[i]);
		}

		int LemonRay[] = {6, 2, 5, 1};
		sum(LemonRay);
		
    }
	public static void sum(int[] LemonRay){
		int sum = 0;

		for(int i=0; i<LemonRay.length; i++){
			sum+=LemonRay[i];
			System.out.println(sum);
		}
	}
}
