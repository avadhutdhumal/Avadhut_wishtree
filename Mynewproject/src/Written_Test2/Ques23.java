package Written_Test2;
import java.util.*;
public class Ques23 {

	public static void main(String[] args) {
		Train t1=new Train(564875, "Paschim Express", 2000);
		Train t2=new Train(365478, "Mahalaxmi Express", 2500);
		Train t3=new Train(214578, "Rajdhani Express", 3500);
		Train t4=new Train(564875, "Nijamuddin Express", 4000);
		
		TreeSet<Train> ts=new TreeSet<Train>(new TrainCom());
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		
		Iterator<Train> it=ts.iterator();
		while(it.hasNext())
		{
			Train t=it.next();
			System.out.println(t.id+"   "+t.name+"    "+t.totalSeats);
		}
		
		
	}

}
