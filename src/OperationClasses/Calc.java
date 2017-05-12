package OperationClasses;
import java.util.Stack;

import Guiclasses.CalculatorGui;

public class Calc {
	
	static Stack<Double> st;

	public static void main(String[] args) {
		Operand op = new Operand();
		Adder add = new Adder();
		Subtracter sub = new Subtracter();
		Multiplier mul = new Multiplier();
		Divider div = new Divider();
		ResultPresenter rp = new ResultPresenter();
		
		CalculatorGui cg = new CalculatorGui(op,add,sub,mul,div,rp);
		st= new Stack<Double>();
		

	}

}
