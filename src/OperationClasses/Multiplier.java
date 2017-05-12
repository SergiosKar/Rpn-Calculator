package OperationClasses;

import java.util.EmptyStackException;

import Guiclasses.CalculatorGui;

public class Multiplier extends Operator{
	public void operate(){
	
		try{
			Double d1=Calc.st.pop();
			Double d2=Calc.st.pop();
			Double d3=d1.doubleValue()*d2.doubleValue();
			
			Calc.st.push(d3);
			CalculatorGui.display.setText(String.valueOf(d3));
			System.out.println("Stack is :"+Calc.st);
		}catch(EmptyStackException e){
	        System.out.println("Empty or with one element list");
	     }

	}
}
