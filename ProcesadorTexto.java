package portafolio;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class ProcesadorTexto {
//======Procesador de texto=========//
	public static void main(String[] args) {
		
		MenuProcesador mimarco=new MenuProcesador();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MenuProcesador extends JFrame {
	
	public MenuProcesador(){
		
		setBounds(450,250,550,400);
		
		LaminaProcesador milamina=new LaminaProcesador();
		
		add(milamina);
	}
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador(){
		
		setLayout(new BorderLayout());
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		//--------------------------------
		 fuente=new JMenu("Fuente");
		 estilo=new JMenu("Estilo");
		 tama�o=new JMenu("Tama�o");		
		//---------------------------------------//
		configuraMenu("Arial", "fuente", "Arial", 9,10);
		configuraMenu("Courier", "fuente", "Courier", 9,10);
		configuraMenu("Verdana", "fuente", "Verdana", 9,10);
		//-----------------------------------------//
		configuraMenu("Negrita", "estilo", "",Font.BOLD,10);
		configuraMenu("Cursiva", "estilo", "",Font.ITALIC,10);
		/*JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita"); 
		JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva");
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		estilo.add(negrita);
		estilo.add(cursiva);*/
		//-----------------------------------------//
		/*configuraMenu("12", "tama�o", "", 9,12);
		configuraMenu("16", "tama�o", "", 9,16);
		configuraMenu("20", "tama�o", "", 9,20);
		configuraMenu("24", "tama�o", "", 9,24);
		*/
		ButtonGroup tama�o_letra=new ButtonGroup();
		JRadioButtonMenuItem doce=new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
		
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK ));
		 
		tama�o_letra.add(doce);
		tama�o_letra.add(dieciseis);
		tama�o_letra.add(veinte);
		tama�o_letra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTama�o",12));

		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTama�o",16));

		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTama�o",20));

		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTama�o",24));
		
		tama�o.add(doce);
		tama�o.add(dieciseis);
		tama�o.add(veinte);
		tama�o.add(veinticuatro);
		//-----------------------------------//
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tama�o);
		laminamenu.add(mibarra);
		
		
		
		add(laminamenu,BorderLayout.NORTH);
		
		miarea=new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		//===========================//
		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem negritaE=new JMenuItem("Negrita");
		
		JMenuItem cursivaE=new JMenuItem("Cursiva");

		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());

		
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		miarea.setComponentPopupMenu(emergente);
		//============================================================================================
		JToolBar barra=new JToolBar();
		barra.setOrientation(1);//orienta la barra de herramientas

		JButton negritaBarra=new JButton(new ImageIcon("src/graficos/imagenes/Negrita.Gif"));
		JButton cursivaBarra=new JButton(new ImageIcon("src/graficos/imagenes/Cursiva.Gif"));
		JButton subraBarra=new JButton(new ImageIcon("src/graficos/imagenes/Subrayado.Gif"));
		
		JButton rojoBarra=new JButton(new ImageIcon("src/graficos/imagenes/rojoBarra.Gif"));
		JButton azulBarra=new JButton(new ImageIcon("src/graficos/imagenes/azulBarra.Gif"));
		JButton amarilloBarra=new JButton(new ImageIcon("src/graficos/imagenes/amarilloBarra.Gif"));
		//===============================================================================//
		JButton derechaBarra=new JButton(new ImageIcon("src/graficos/imagenes/derechaBarra.Gif"));
		JButton centradoBarra=new JButton(new ImageIcon("src/graficos/imagenes/centradoBarra.Gif"));
		JButton justificadoBarra=new JButton(new ImageIcon("src/graficos/imagenes/justificadoBarra.Gif"));
		JButton izquierdaBarra=new JButton(new ImageIcon("src/graficos/imagenes/izquierdaBarra.Gif"));
		//=============================================================================//
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());//pone en escuha al clic y lo poinbe en negrita
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul", Color.RED));
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul", Color.BLUE));
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.YELLOW));
		
		izquierdaBarra.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
		centradoBarra.addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
		derechaBarra.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
		justificadoBarra.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 3));
		
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subraBarra);
		barra.add(rojoBarra);
		barra.add(azulBarra);
		barra.add(amarilloBarra);
		
		barra.add(izquierdaBarra);
		barra.add(centradoBarra);
		barra.add(derechaBarra);
		barra.add(justificadoBarra);
		
		add(barra, BorderLayout.WEST);
		
		
		//==========================================================================================//
		
	}
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam){
		//metodo
		JMenuItem elemMenu=new JMenuItem(rotulo);
		
		if(menu=="fuente"){
			fuente.add(elemMenu);
			if(tipoLetra=="Arial"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Arial"));
			}else if (tipoLetra=="Courier"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Courier"));
			}else if(tipoLetra == "Verdadada"){
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Verdana"));
			}
			
		}
		else if(menu=="estilo"){
			
			estilo.add(elemMenu);
			if(estilos==Font.BOLD){

				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));//evento atajo de teclado
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
					
			}else if(estilos==Font.ITALIC){
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));//evento atajo de teclado 
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
				
			}
			
		}else if(menu=="tama�o"){
			tama�o.add(elemMenu);
			
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTama�o",tam));
			
		}
		
	}	
	
	
	JTextPane miarea;
	JMenu fuente,estilo, tama�o;
	Font letra;
	
	
}


