package aula2;

public class atividadeCarro {
	
	public static void main(String[] args) {
		carro carro1 = new carro();
		carro carro2 = new carro();
		
		carro1.setcor ("amarelo");
		carro1.setmarca ("mitsubishi");
		carro1.setviraD ("Sim");
		carro1.setviraE ("sim");
		carro1.setaceleracao (9.3);
		carro1.setligarfarol ("sim");
		
		carro2.setcor ("preto");
		carro2.setmarca ("chevrolet");
		carro2.setviraD ("Sim");
		carro2.setviraE ("sim");
		carro2.setaceleracao (8.2);
		carro2.setligarfarol ("sim");
		
		System.out.println(" carro 1"); 
		System.out.println(carro1.getcor());
		System.out.println(carro1.getmarca());
		System.out.println(carro1.getviraD());
		System.out.println(carro1.getviraE());
		System.out.println(carro1.getaceleracao());
		System.out.println(carro1.getligarfarol());
		
		System.out.println(" carro 2"); 
		System.out.println(carro2.getcor());
		System.out.println(carro2.getmarca());
		System.out.println(carro2.getviraD());
		System.out.println(carro2.getviraE());
		System.out.println(carro2.getaceleracao());
		System.out.println(carro2.getligarfarol());
		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
