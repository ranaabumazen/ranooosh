package rana;

import javax.swing.JOptionPane;

public class model {

	int oper=0;
	double opr1,opr2, result;
	
	
	public void setoper(int oper) {
		this.oper=oper;
		
		
	}
	public void setopr(String opr) {
		if(!(opr.equals("")))
		{
			if(oper==0)
				opr1=Double.valueOf(opr);
			else
				opr2=Double.valueOf(opr);
		}
		
	}
	public void setResult(double result) {
		this.result=result;
	}
	public double getResult() {
		
		return result;
	}
	public void FindOperation() {

		switch(oper){
			case 1:
				result=opr1+opr2;
				break;
			case 2:
				result=opr1-opr2;
				break;
			case 3:
				result=opr1*opr2;
				break;
			case 4:
				if(opr2==0) {
					throw new IllegalArgumentException("error can't divide by zero");
				}
				result=opr1/opr2;
				break;
			case 5:
				if(opr1<0) {
					JOptionPane.showMessageDialog(null,"error,the operand must be positive");
					throw new IllegalArgumentException("error, operand must be positive ");
					
				}
				result=Math.sqrt(opr1);
				break;
			case 6:
				if(opr2==0) {
					throw new IllegalArgumentException("error can't divide by zero");
				}
				result=opr1%opr2;
				break;
		}
		opr1 =result;
		
	}
}
