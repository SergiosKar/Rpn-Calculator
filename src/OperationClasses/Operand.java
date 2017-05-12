package OperationClasses;
import java.util.Stack;

import Guiclasses.CalculatorGui;


public class Operand {
	private int val=0;
	
    
    public void addDigit(char c){
        val=val*10+Character.getNumericValue(c);
        System.out.println(val);
        CalculatorGui.display.setText(String.valueOf(val));
       
    }
    public void complete(){
        Calc.st.push(new Double(val));
        System.out.println(val);
        System.out.println("Stack is :"+Calc.st);
        val=0;
        CalculatorGui.display.setText(String.valueOf(val));
        
        
    }
    public void deleteLastDigit(){
        val = val/10;
        System.out.println(val);
        CalculatorGui.display.setText(String.valueOf(val));

    }
    public void reset(){
        Calc.st = new Stack<Double>();
        val = 0;
        System.out.println(val);
        CalculatorGui.display.setText(String.valueOf(val));

        
    }

}
