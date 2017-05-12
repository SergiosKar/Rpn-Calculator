package OperationClasses;

import java.util.EmptyStackException;

import Guiclasses.CalculatorGui;

public class Divider extends Operator{
	
	public void operate(){
		
		try{
			Double d1=Calc.st.pop();
			Double d2=Calc.st.pop();
			Double d3=d2.doubleValue()/d1.doubleValue();
			
			if (d1!=0){
				Calc.st.push(d3);
				System.out.println("Stack is :"+Calc.st);
				CalculatorGui.display.setText(String.valueOf(d3));
			}
			else {Calc.st.push(new Double(0));
			System.out.println("Stack is :"+Calc.st);//if divide by zero return zero
			CalculatorGui.display.setText(String.valueOf(0));
		
			}
		}catch(EmptyStackException e){
	         System.out.println("Empty or with one element list");
	      }
	}

}
