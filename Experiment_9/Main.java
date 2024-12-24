import java.awt.*;
import java.awt.event.*;
class DivisionMain1 extends Frame implements ActionListener
{
	TextField num1,num2;
	Button dResult;
	Label outResult;
	String out="";
	double resultNum;
	int flag=0;
	public DivisionMain1()
	{
		setLayout(new FlowLayout());
		dResult = new Button("Result:");
		Label number1 = new Label("Number 1:",Label.RIGHT); 
		Label number2 = new Label("Number 2:",Label.RIGHT);
		num1=new TextField(5);
		num2=new TextField(5);
		outResult = new Label("",Label.RIGHT);
		add(number1);
		add(num1);
		add(number2);
		add(num2);
		add(dResult);
		add(outResult);
		num1.addActionListener(this);
		num2.addActionListener(this);
		dResult.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		int n1,n2;
		try
		{
			if (e.getSource() == dResult)
			{
				n1=Integer.parseInt(num1.getText());
				n2=Integer.parseInt(num2.getText());
				if(n2==0)
				{throw new ArithmeticException();}
				out=n1+"/"+n2+" ";
				resultNum=n1/n2;
				out+=resultNum; 
			}
		}
		catch(NumberFormatException e1)
		{
			flag=1;
			out="Number Format Exception!"+e1; 
		}
		catch(ArithmeticException e1)
		{
			flag=1;
			out="Divide by 0 Exception!"+e1; 
		}
		outResult.setText(out);
		invalidate();
		validate();
	}
	//public void paint(Graphics g)
	//{
	//	if(flag==0)
	//	{g.drawString(out,dResult.getX()+dResult.getWidth(),dResult.getY()+outResult.getHeight()-8);}
	//	else
	//	{g.drawString(out,100,200); flag=0;}
	//}
	
}

public class Main
{
	public static void main(String args[])
	{
		DivisionMain1 obj=new DivisionMain1();
		obj.setSize(new Dimension(800,400));
		obj.setTitle("DivisionOfIntegers");
		obj.setVisible(true);
	}
}