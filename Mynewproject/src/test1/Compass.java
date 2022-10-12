package test1;

public class Compass {
	String bname;
	int price;
	Pen pen;

	Compass(String bname,int price,Pen pen)
	{
	this.bname=bname;
	this.price=price;
	this.pen=pen;
	}
	
	public static void main(String[] args) {
		Pen p=new Pen();	
		Compass c=new Compass("Akash", 10,p);
					
			}
		}

