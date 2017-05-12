package Guiclasses;
import java.awt.*;


import OperationClasses.Adder;
import OperationClasses.Divider;
import OperationClasses.Multiplier;
import OperationClasses.Operand;
import OperationClasses.ResultPresenter;
import OperationClasses.Subtracter;


public class CalculatorGui extends Frame{
	
	public static TextField display;
	
	
	public CalculatorGui(Operand op,Adder add,Subtracter sub,Multiplier mul,Divider div,ResultPresenter rp){
		super("JAVA Polish Reverse Calculator");
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(new CloseWindowAndExit());
		this.setSize(300,330);
		this.setBackground(Color.darkGray);
		
		
		Font font=new Font("Impact",Font.BOLD,16);
		this.setFont(font); //To set the font of this container.
		
		this. toFront();
		  CalcButton b0=new CalcButton("0",104,265,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b1=new CalcButton("1",64,232,35,28, new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b2=new CalcButton("2",104,232,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b3=new CalcButton("3",144,232,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);	  
		  CalcButton b4=new CalcButton("4",64,199,35,28, new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b5=new CalcButton("5",104,199,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b6=new CalcButton("6",144,199,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b7=new CalcButton("7",64,166,35,28, new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b8=new CalcButton("8",104,166,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		  CalcButton b9=new CalcButton("9",144,166,35,28,new Font("Courier New", Font.BOLD, 12),Color.CYAN,this,op,null);
		
		  //CalcButton bcomma =new CalcButton(".",144,265,35,28,new Font("Courier New", Font.BOLD, 12),Color.magenta,this,op,null);
		  CalcButton benter= new CalcButton("Enter",204,100,56,28,new Font("Courier New", Font.BOLD, 12),Color.magenta,this,op,null);
		  CalcButton bce =new CalcButton("CE",144,133,35,28,new Font("Courier New", Font.BOLD, 12),Color.magenta,this,op,null);
		  CalcButton bc= new CalcButton("C",144,100,35,28,new Font("Courier New", Font.BOLD, 12),Color.magenta,this,op,null);
		  CalcButton bback=new CalcButton("Backspace",64,100,75,28,new Font("Courier New", Font.BOLD, 12),Color.magenta,this,op,null);		  
		  
		  CalcButton badd=new CalcButton("+",195,265,35,28,new Font("Courier New", Font.BOLD, 12),Color.RED,this,op,add);
		  CalcButton bsub=new CalcButton("-",195,232,35,28,new Font("Courier New", Font.BOLD, 12),Color.RED,this,op,sub);
		  CalcButton bmul=new CalcButton("*",195,199,35,28,new Font("Courier New", Font.BOLD, 12),Color.RED,this,op,mul);
		  CalcButton bdiv=new CalcButton("/",195,166,35,28,new Font("Courier New", Font.BOLD, 12),Color.RED,this,op,div);
		  CalcButton bequal=new CalcButton("=",144,265,35,28,new Font("Courier New", Font.BOLD, 12),Color.RED,this,op,rp);
		
		  CalculatorGui.display = new TextField();
		  CalculatorGui.display.setBounds(64, 50, 200, 50);
		  this.add(CalculatorGui.display);
		
	
	}
}










		



	




