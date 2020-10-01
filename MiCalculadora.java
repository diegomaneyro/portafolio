package Portafolio_de_aprendisaje;
import java.awt.*;
import javax.swing.*;
public class MiCalculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora marco1=new MarcoCalculadora();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.setVisible(true);
		
		marco1.setResizable(false);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora(){
		
		setBounds(300, 150, 350, 250);
		
		setTitle("Calculadora");
		
		LaminaDisplay lamina1=new LaminaDisplay();
		
		LaminaBotones lamina2=new LaminaBotones();
		
		add(lamina1, BorderLayout.NORTH);
		
		add(lamina2, BorderLayout.CENTER);
	}
}

class LaminaDisplay extends JPanel{
	
	public LaminaDisplay(){
		
		setLayout(new BorderLayout());		
	
		display=new JTextField("0");
		
		add(display);
	}
	JTextField display;
}

class LaminaBotones extends JPanel{
	
	public LaminaBotones(){
		
		setLayout(new GridLayout(4, 4));
		
		JButton	boton7=new JButton("7");
			
		JButton boton8=new JButton("8");
		
		JButton boton9=new JButton("9");
		
		JButton	botonDiv=new JButton("/");
		
		JButton boton4=new JButton("4");
		
		JButton boton5=new JButton("5");
		
		JButton	boton6=new JButton("6");
		
		JButton botonPor=new JButton("*");
		
		JButton boton1=new JButton("1");
		
		JButton	boton2=new JButton("2");
		
		JButton boton3=new JButton("3");
		
		JButton botonMen=new JButton("-");

		JButton	botonCero=new JButton("0");
			
		JButton botonPunt=new JButton(".");
		
		JButton botonIgu=new JButton("=");
		
		JButton	botonMas=new JButton("+");
		
		
		
		add(boton7);
		
		add(boton8);
		
		add(boton9);
		
		add(botonDiv);
		
		add(boton4);
		
		add(boton5);
		
		add(boton6);

		add(botonPor);

		add(boton1);

		add(boton2);

		add(boton3);

		add(botonMen);
		
		add(botonCero);
		
		add(botonPunt);
		
		add(botonIgu);
		
		add(botonMas);

		
	}
 
}
