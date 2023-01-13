public class doblefor {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int columnas = 10;
		int filas = 4;
		int c=0;
		for (int z = 0; z < 2; z++) {
			while (z == 0 || z == 1) {
				for (int k = 0; k < 3; k++) {
					for (int i = 0; i < filas; i++) {
						for (int j = 0; j < columnas; j++) {
							if (j % 2 == 0 && j % 4 == 0)
								
								System.out.print(j);
							else
								System.out.print("m");
						}
						System.out.println();
					}
					System.out.println(c++);
				}
			}
		}
	}

}