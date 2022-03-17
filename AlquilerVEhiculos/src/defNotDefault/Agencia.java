package defNotDefault;

import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
	
	private ArrayList<Vehiculo> flota ;
	private ArrayList<Vehiculo> alquilados = new ArrayList<>();
	private ArrayList<Empresa> empresas;
	private int edad = 1;
	
	
	public Agencia (ArrayList<Vehiculo> flota ,ArrayList<Empresa> empresas ) {
		this.flota= flota;
		this.empresas = empresas;
		
	}
	
	public void cuestionario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia " + this.edad);
		int empresa;
		do {
			System.out.println("Que empresa desea alquilar?");
			empresa = sc.nextInt();
			 if(empresa==-1) {
				 pasarDia();
			 }
			System.out.println(this.empresas.get(empresa -1).getNombre());
			System.out.println("Que vehiculo desea alquilar?");
			int tipo = sc.nextInt();
				if(tipo==1) {
					System.out.println("Un Coche");
				}
	
				if(tipo==2) {
					System.out.println("Una furgoneta");
				}
				if(tipo==3) {
					System.out.println("Una moto");
				}
			System.out.println("Durante cuantos dias?");
			int dias = sc.nextInt();
			System.out.println("Durante "+ dias + " dias");
			alquilarVehiculo(empresa , tipo , dias);
		}while(empresa!=-1);
		
	}
	public void pasarDia() {
		this.edad++;
		System.out.println("VEHICULOS SIN ALQUILAR");
		for (int i = 0; i < this.flota.size(); i++) {
			this.flota.get(i).toStringSin();
		}
		for (int i = 0; i < alquilados.size(); i++) {
			alquilados.get(i).toStringCon();
			alquilados.get(i).setDias(alquilados.get(i).getDias()-1);
			if(alquilados.get(i).getDias()<0) {
				alquilados.get(i).setEmpresa(null);
				flota.add(alquilados.get(i));
				alquilados.remove(i);
			}
			
		}
	}
	public void alquilarVehiculo(int empresa, int tipo ,int dias) {
		for (int i = 0; i < flota.size(); i++) {
			
			if(tipo==1 &&  flota.get(i) instanceof Coche) {
				flota.get(i).setEmpresa(this.empresas.get(empresa));
				flota.get(i).setAlquiler(true);
				flota.get(i).setDias(dias);
				alquilados.add(flota.get(i));
				flota.remove(i);
				System.out.println("asdasdasdasd");
				break;
			}
			if (tipo==2 && flota.get(i) instanceof Furgoneta) {
				flota.get(i).setEmpresa(this.empresas.get(empresa));
				flota.get(i).setAlquiler(true);
				flota.get(i).setDias(dias);
				alquilados.add(flota.get(i));
				flota.remove(i);
				break;
			}
			if(tipo==3 && flota.get(i) instanceof Moto) {
				flota.get(i).setEmpresa(this.empresas.get(empresa));
				flota.get(i).setAlquiler(true);
				flota.get(i).setDias(dias);
				alquilados.add(flota.get(i));
				flota.remove(i);
				break;
			}
			break;
		}
	}

}
