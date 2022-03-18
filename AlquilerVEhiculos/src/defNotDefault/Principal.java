package defNotDefault;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Coche coche1 = new Coche("001c", "01c", "1c", 1, 1);
		Coche coche2 = new Coche("002c", "02c", "2c", 2, 2);
		Coche coche3 = new Coche("003c", "03c", "3c", 3, 3);
		Coche coche4 = new Coche("004c", "04c", "4c", 4, 4);
		Coche coche5 = new Coche("005c", "05c", "5c", 5, 5);
		Coche coche6 = new Coche("006c", "06c", "6c", 6, 6);
		Coche coche7 = new Coche("007c", "07c", "6c", 7 , 7);
		ArrayList<Vehiculo> arr= new ArrayList<>();
		arr.add(coche1);
		arr.add(coche2);
		arr.add(coche3);
		arr.add(coche4);
		arr.add(coche5);
		arr.add(coche6);
		arr.add(coche7);
		
		
		Moto moto1= new Moto("001m", "01m", "1m", 1, false);
		Moto moto2= new Moto("002m", "02m", "2m", 2, true);
		arr.add(moto1);
		arr.add(moto2);
		
		Furgoneta furgoneta1= new Furgoneta("001f", "01f","1f" , 1, 1);
		Furgoneta furgoneta2= new Furgoneta("002f", "02f","2f" , 2, 2);
		Furgoneta furgoneta3= new Furgoneta("003f", "03f","3f" , 3, 3);
		arr.add(furgoneta1);
		arr.add(furgoneta2);
		arr.add(furgoneta3);
//		Empresa fake = new Empresa("fake","Fake");
		Empresa empresa1 = new Empresa("1","1e");
		Empresa empresa2 = new Empresa("2","2e");
		Empresa empresa3 = new Empresa("3","3e");
		Empresa empresa4 = new Empresa("4","4e");
		Empresa empresa5 = new Empresa("5","5e");
		Empresa empresa6 = new Empresa("6","6e");
		ArrayList<Empresa> arrEmpresa= new ArrayList<>();
//		arrEmpresa.add(fake);
		arrEmpresa.add(empresa1);
		arrEmpresa.add(empresa2);
		arrEmpresa.add(empresa3);
		arrEmpresa.add(empresa4);
		arrEmpresa.add(empresa5);
		arrEmpresa.add(empresa6);
		
		Agencia agencia = new Agencia(arr, arrEmpresa);
		
		while (true) agencia.cuestionario();
		
//		System.out.println("end");
		
	}

}
