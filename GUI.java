import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
private Calculator cal;
private JTextField input;
//constructeur
	public GUI(){
		super();
		this.setTitle("Calculator");
		this.setSize(310,300);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		JPanel newPanel = new JPanel();
		this.add(newPanel, BorderLayout.NORTH);
		input = new JTextField(25);
		newPanel.add(input);
		JPanel panel = new JPanel();
		this.add(panel);
		panel.setLayout(new GridLayout(4,4));
			JButton  zero= new JButton ("0");
			JButton un = new JButton ("1");
			JButton deux = new JButton ("2");
			JButton trois = new JButton ("3");
			JButton clear = new JButton ("C");
			clear.setBackground(Color.red);
			JButton quatre = new JButton ("4");
			JButton  cinq= new JButton ("5");
			JButton  six= new JButton ("6");
			JButton  sept= new JButton ("7");
			JButton factoriel = new JButton ("!");
			JButton huit = new JButton ("8");
			JButton neuf = new JButton ("9");
			JButton  plus= new JButton ("+");
			JButton  moins= new JButton ("-");
			JButton multiplication  = new JButton ("*");
			JButton  power= new JButton ("pow");
			JButton  square= new JButton ("sqrt");
			JButton  logarithme= new JButton ("ln");
			JButton  egal= new JButton ("=");
			egal.setBackground(Color.yellow);
			JButton division = new JButton ("/");

				zero.addActionListener(this);
				un.addActionListener(this);
				deux.addActionListener(this);
				trois.addActionListener(this);
				quatre.addActionListener(this);
				cinq.addActionListener(this);
				six.addActionListener(this);
				sept.addActionListener(this);
				huit.addActionListener(this);
				neuf.addActionListener(this);
				plus.addActionListener(this);
				moins.addActionListener(this);
				multiplication.addActionListener(this);
				division.addActionListener(this);
				factoriel.addActionListener(this);
				logarithme.addActionListener(this);
				egal.addActionListener(this);
				square.addActionListener(this);
				power.addActionListener(this);
				clear.addActionListener(this);
					panel.add(zero);
					panel.add(un);
					panel.add(deux);
					panel.add(trois);
					panel.add(clear);
					panel.add(quatre);
					panel.add(cinq);
					panel.add(six);
					panel.add(sept);
					panel.add(factoriel);
					panel.add(huit);
					panel.add(neuf);
					panel.add(plus);
					panel.add(moins);
					panel.add(multiplication);
					panel.add(power);
					panel.add(square);
					panel.add(logarithme);
					panel.add(egal);
					panel.add(division);
					setVisible(true);
				    cal=new Calculator();
				}
	//assignations des action de commandes
		public void actionPerformed ( ActionEvent e ) {
			String comma = e.getActionCommand();
				if(comma.equals("0")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("1")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("2")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("3")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("4")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("5")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("6")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("7")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("8")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("9")){
					int n=Integer.parseInt(comma);
					input.setText(input.getText()+Integer.toString(n));
				}
				else if(comma.equals("+")){
					cal.add();
					cal.setFirst(Double.parseDouble(input.getText()));
					input.setText(null);				   
				}
				else if(comma.equals("-")){
					cal.subtract();	
					cal.setFirst(Double.parseDouble(input.getText()));
					input.setText(null);
				}
				else if(comma.equals("*")){
					cal.multiply();
					cal.setFirst(Double.parseDouble(input.getText()));
					input.setText(null);
				}
				else if(comma.equals("/")){
					cal.divide();
					cal.setFirst(Double.parseDouble(input.getText()));
					input.setText(null);
				}
				else if(comma.equals("!")){
					cal.factorial();
					cal.setFirst(Double.parseDouble(input.getText()));
					input.setText(null);
				}
				else if(comma.equals("ln")){
					cal.nepLog();
					input.setText(null);       
				}
				else if(comma.equals("sqrt")){
					cal.rootSquare();
					input.setText(null);
				}
				else if(comma.equals("pow")){
					cal.pow();
					cal.setFirst(Double.parseDouble(input.getText()));
					input.setText(null);
				}
				else if(comma.equals("C")){
					cal.clear();
					input.setText(null);
				}
			    else if(comma.equals("=")){
						if(cal.getOp()=="+"){
							cal.setSecond(Double.parseDouble(input.getText()));		
							cal.compute();
						}
								
						else if(cal.getOp()=="-"){
							cal.setSecond(Double.parseDouble(input.getText()));
							cal.compute();
						}
						
						else if(cal.getOp()=="*"){
							cal.setSecond(Double.parseDouble(input.getText()));
							cal.compute();
						}
						else if(cal.getOp()=="/"){
							cal.setSecond(Double.parseDouble(input.getText()));
							cal.compute();
						}
						else if(cal.getOp()=="pow"){
							cal.setSecond(Double.parseDouble(input.getText()));
							cal.compute();
						}
						else if(cal.getOp()=="sqrt"){
							cal.setFirst(Double.parseDouble(input.getText()));
							cal.compute();
						}
									
						else if(cal.getOp()=="!"){
							cal.compute();
						}
						else if(cal.getOp()=="ln"){
							cal.setFirst(Double.parseDouble(input.getText()));
							cal.compute();
						
						}
					String result=String.valueOf(cal.getSecond());
					input.setText(result);
			    }
		}
		public static void main(String[] args){
			new GUI();
		}
}