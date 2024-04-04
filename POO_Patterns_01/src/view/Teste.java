package view;

import model.Carga;
import model.Motor;
import model.Passeio;
import model.Veiculo;

public class Teste {

	public static void main(String[] args) {
		
		Passeio vei01 = new Passeio();
		Passeio vei02 = new Passeio();
		
		Carga vei03 = new Carga();
		Carga vei04 = new Carga();
		
		Motor motPass = new Motor();
		Motor motCarg = new Motor();
		
		motPass.setPotencia(400);
		motPass.setQtdPist(6);
		
		motCarg.setPotencia(1000);
		motCarg.setQtdPist(8);
		
		vei01.setMotor(motPass);
		vei01.setPlaca("08V2N18");
		vei01.setQtdRodas(4);
		vei01.setVelocMax(200);
		vei01.setModelo("Hatch");
		vei01.setMarca("Fiat");
		vei01.setCor("Vermelho");
		vei01.setQtdPassageiros(5);
		
		vei02.setMotor(motPass);
		vei02.setPlaca("94N7N21");
		vei02.setQtdRodas(4);
		vei02.setVelocMax(180);
		vei02.setModelo("SUV");
		vei02.setMarca("Audi");
		vei02.setCor("Prata");
		vei02.setQtdPassageiros(8);
		
		vei03.setMotor(motCarg);
		vei03.setPlaca("13E9N07");
		vei03.setQtdRodas(8);
		vei03.setVelocMax(100);
		vei03.setModelo("Pesado");
		vei03.setMarca("Volkswagen");
		vei03.setCor("Preto");
		vei03.setCargaMax(1000);
		vei03.setTara(600);
		
		vei04.setMotor(motCarg);
		vei04.setPlaca("46E0L35");
		vei04.setQtdRodas(10);
		vei04.setVelocMax(120);
		vei04.setModelo("Superpesado");
		vei04.setMarca("BMW");
		vei04.setCor("Branco");
		vei04.setCargaMax(1800);
		vei04.setTara(1000);

		System.out.println("A velocidade máxima do veiculo "+vei01.getMarca()+" "+vei01.getModelo()+" é "+vei01.calcVel(vei01.getVelocMax())+"m/h.");
		System.out.println("A velocidade máxima do veiculo "+vei02.getMarca()+" "+vei02.getModelo()+" é "+vei02.calcVel(vei02.getVelocMax())+"m/h.");
		
		System.out.println("A velocidade máxima do veiculo "+vei03.getMarca()+" "+vei03.getModelo()+" é "+vei03.calcVel(vei03.getVelocMax())+"cm/h.");
		System.out.println("A velocidade máxima do veiculo "+vei04.getMarca()+" "+vei04.getModelo()+" é "+vei04.calcVel(vei04.getVelocMax())+"cm/h.");
	}

}
