
public class EjercicioBreak {

	public static void main(String[] args) {
		// Escribe los numeros desde el mil en adelante asta encontrar el 1100 en cuyo caso paras de escribir números    

		System.out.println("De 1000 a 1100");
		int num = 1000;
		while (true) {
			System.out.println(num++);
			if (num > 1100) {
				break;
			}
		}
		
		
		// Escreibe los multiplos de 3 en orden decreciente partiendo de 96 hacia abajo
		// Al llegar a 9 paras
		
		System.out.println("De 96 a 9");
		
		num=96;
		while (true) {
			System.out.println(num);
			if (num == 9) {
				break;
			}
			num-=3;
			
		}
	}

}
