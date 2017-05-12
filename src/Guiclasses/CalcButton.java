package Guiclasses;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import OperationClasses.Operand;
import OperationClasses.Operator;


public class CalcButton  extends Button{
	

	public CalcButton( String i,int d1,int d2,int d3,int d4,Font font,Color c,Frame frame,Operand op,Operator oper){
		super(i);
		
		this.setBounds(d1,d2,d3,d4);
		this.setFont(font);
		this.setBackground(c);
		frame.add(this);
		ButtonHandler handler = new ButtonHandler(op,oper);
		this.addActionListener(handler);
	}

}