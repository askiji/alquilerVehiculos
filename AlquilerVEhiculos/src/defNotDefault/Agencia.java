package defNotDefault;

import java.util.ArrayList;
import java.util.Comparator;

public class Agencia {
	
	private ArrayList<Vehiculo> flota ;
	private ArrayList<Vehiculo> alquilados=new ArrayList<>();
	private ArrayList<Empresa> empresas;
	private ArrayList<Vehiculo> ordenados= new ArrayList<>();
	private int edad = 1;
	private int numCoches = 0;
	private int numFurgonetas =0;
	private int numMotos = 0 ;
	
	
	public Agencia (ArrayList<Vehiculo> flota ,ArrayList<Empresa> empresas) {
		this.flota= flota;
		this.empresas = empresas;
		
	}
	
	public void cuestionario() {
		ScannerRamon sc = new ScannerRamon();
		System.out.println("Dia " + this.edad);
		int empresa;
		do {
			System.out.println("Que empresa desea alquilar ?");
			empresa = sc.nextInt(-2,5);
			 if(empresa==-1) {
				 imprimir(alquilados);
				 pasarDia();
			 }
			 else if(empresa==-2) {
				 ordenar();
				 imprimir(ordenados);
			 }
			else {
				empresa--;
				System.out.println(this.empresas.get(empresa).getNombre());
				System.out.println("Que vehiculo desea alquilar ?");
				int tipo = sc.nextInt(1,3);
				
					if (tipo == 1 && this.numCoches <7 ) {
						System.out.println("Un Coche");
						System.out.println("Durante cuantos dias ?");
						int dias = sc.nextInt(1,100000);
						System.out.println("Durante " + dias + " dias");
						alquilarVehiculo(empresa, tipo, dias);
						break;
					}
				
					if (tipo == 2 &&  this.numFurgonetas <3 ) {
						System.out.println("Una furgoneta");
						System.out.println("Durante cuantos dias ?");
						int dias = sc.nextInt(1,100000);
						System.out.println("Durante " + dias + " dias");
						alquilarVehiculo(empresa, tipo, dias);
						break;
					}
					if (tipo == 3 && this.numMotos<2  ) {
						System.out.println("Una moto");
						System.out.println("Durante cuantos dias ?");
						int dias = sc.nextInt(1,100000);
						System.out.println("Durante " + dias + " dias");
						alquilarVehiculo(empresa, tipo, dias);
						break;
					}
					
				
				else {
					System.out.println("No quedan Vehiculos");
				}
			}
		}while(empresa!=-1);
		
	}
	public void ordenar() {
   		ordenados= (ArrayList<Vehiculo>) alquilados.clone();
		
		ordenados.sort(Comparator.comparing(Vehiculo::getDias));
		
	}
		
	public void imprimir(ArrayList<Vehiculo>  foo) {
		System.out.println("---------------------");
		System.out.println("VEHICULOS SIN ALQUILAR");
		for (int i = 0; i < this.flota.size(); i++) {
			System.out.println( this.flota.get(i).getClass().getSimpleName() + this.flota.get(i).toStringSin());
			
		}
		System.out.println("---------------------");
		System.out.println("VEHICULOS ALQUILADOS");
		for (int i = 0; i < foo.size(); i++) {
			System.out.println(foo.get(i).getClass().getSimpleName() + foo.get(i).toStringCon());
		}
		
	}
	public void pasarDia() {
		this.edad++;
		for (int i = 0; i < alquilados.size(); i++) {
			alquilados.get(i).setDias(alquilados.get(i).getDias()-1);
			if(alquilados.get(i).getDias()<0) {
				alquilados.get(i).setEmpresa(null);
				flota.add(alquilados.get(i));
				if(alquilados.get(i) instanceof Coche) {
					this.numCoches--;
				}
				if(alquilados.get(i) instanceof Furgoneta) {
					this.numFurgonetas--;
				}
				if(alquilados.get(i) instanceof Moto) {
					this.numMotos--;
				}
				alquilados.remove(i);
			}
			
		}
	}

	public void alquilarVehiculo(int empresa, int tipo, int dias) {
		System.out.println("El tipo es " + tipo);
		if (tipo == 1) {
			for (int i = 0; i < flota.size(); i++) {
				if (flota.get(i) instanceof Coche) {
					flota.get(i).setEmpresa(this.empresas.get(empresa));
					flota.get(i).setAlquiler(true);
					flota.get(i).setDias(dias);
					alquilados.add(flota.get(i));
					flota.remove(i);
					System.out.println("Coche alquilado");
					this.numCoches++;
					System.out.println(this.numCoches);
					break;
				}
			}
		}
		if (tipo == 2) {
			for (int i = 0; i < flota.size(); i++) {
				if (flota.get(i) instanceof Furgoneta) {
					flota.get(i).setEmpresa(this.empresas.get(empresa));
					flota.get(i).setAlquiler(true);
					flota.get(i).setDias(dias);
					alquilados.add(flota.get(i));
					flota.remove(i);
					System.out.println("Furgoneta alquilada");
					this.numFurgonetas++;
					break;
				}
			}
		}
		if (tipo == 3) {
			for (int i = 0; i < flota.size(); i++) {
				if (flota.get(i) instanceof Moto) {
					flota.get(i).setEmpresa(this.empresas.get(empresa));
					flota.get(i).setAlquiler(true);
					flota.get(i).setDias(dias);
					alquilados.add(flota.get(i));
					flota.remove(i);
					this.numMotos++;

					
					System.out.println("Moto alquilada");
					break;
				}
			}

		}
	}

	
	
//	Comparator<Vehiculo> compararDias = 
//			(Vehiculo v1, Vehiculo v2) -> v1.getDias().compareTo(v2.getDias());

	public ArrayList<Vehiculo> getFlota() {
		return flota;
	}

	public void setFlota(ArrayList<Vehiculo> flota) {
		this.flota = flota;
	}

	public ArrayList<Vehiculo> getAlquilados() {
		return alquilados;
	}

	public void setAlquilados(ArrayList<Vehiculo> alquilados) {
		this.alquilados = alquilados;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumCoches() {
		return numCoches;
	}

	public void setNumCoches(int numCoches) {
		this.numCoches = numCoches;
	}

	public int getNumFurgonetas() {
		return numFurgonetas;
	}

	public void setNumFurgonetas(int numFurgonetas) {
		this.numFurgonetas = numFurgonetas;
	}

	public int getNumMotos() {
		return numMotos;
	}

	public void setNumMotos(int numMotos) {
		this.numMotos = numMotos;
	}

}
