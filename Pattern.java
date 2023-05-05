class Pattern {
	public static void main (String args[]) {
		//Square
		System.out.println("Square");
		int i,j,n=10;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}

		//Square Border
		System.out.println("Square Border");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}

		//Square Border And Cross
		System.out.println("Square Border And Cross");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||j==i||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}

		//Increasing Triangle
		System.out.println("Increasing Triangle");
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}

		//Increasing Triangle Border
		System.out.println("Increasing Triangle Border");
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(i==n||j==1||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}

		//Decreasing Triangle
		System.out.println("Decreasing Triangle");
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}

		//Decreasing Triangle Border
		System.out.println("Decreasing Triangle Border");
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				if(i==1||j==n||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}

		//Diamond Structure:
		System.out.println("Diamond Structure");
		for(i=1;i<n;i++) {
			for(j=i;j<=n;j++)
				System.out.print("  ");
			for(j=1;j<i;j++)
				System.out.print("* ");
		    for(j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
				System.out.print("  ");
			for(j=i;j<n;j++)
				System.out.print("* ");
		    for(j=i;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}

		//Diamond Structure Border:
		System.out.println("Diamond Structure Border");
		for(i=1;i<n;i++) {
			for(j=i;j<=n;j++)
				System.out.print("  ");
			for(j=1;j<i;j++) {
				if(j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		    for(j=1;j<=i;j++) {
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
				System.out.print("  ");
			for(j=i;j<n;j++) {
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		    for(j=i;j<=n;j++) {
				if(j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}
	}
}