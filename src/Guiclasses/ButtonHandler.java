package Guiclasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import OperationClasses.Operand;
import OperationClasses.Operator;


public class ButtonHandler implements ActionListener{
	
	Operand op;
	Operator oper;
    public ButtonHandler(Operand op,Operator oper){
    	this.op=op;
    	this.oper=oper;
    }
	

	
	public void actionPerformed(ActionEvent pushingButton) {
		
		CalcButton sourceButton = (CalcButton) pushingButton.getSource();

		String label =sourceButton.getLabel();
		//CalculatorGui.display.setText(label);
		
		
		char c = label.charAt(0);
       
		switch (label){
	        
	        case "Enter":
	        	op.complete();
	        	break;
	        case "C":
	        	op.reset();
	        	break;
	        case "CE":
	        	op.reset();
	        	break;
	        case "Backspace":
	        	op.deleteLastDigit();
	        	break;	        
	        /*case ".":
	        	oper.operate(); 
	        	break;*/
	        case "+":
	        	oper.operate(); 
	        	break;
	        case "-":
	        	oper.operate();       
	        	break;
	        case "*":
	        	oper.operate(); 
	        	break;
	        case "/":
	        	oper.operate(); 
	        	break;
	        case "=":
	        	oper.operate();
	        	break;
	        
	        default:
	        	op.addDigit(c);
	        	
	        }
        	
        
    }
		
		
		
		
		
	
	}
