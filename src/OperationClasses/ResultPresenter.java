package OperationClasses;

import java.util.EmptyStackException;

import Guiclasses.CalculatorGui;

public class ResultPresenter extends Operator{
	
	public void operate(){
	
	try{
		Double d1=Calc.st.pop();
		
		CalculatorGui.display.setText(String.valueOf(d1));
		
		System.out.println("Stack is :"+Calc.st);
	}catch(EmptyStackException e){
        System.out.println("Empty or with one element list");
     }

	}
}
