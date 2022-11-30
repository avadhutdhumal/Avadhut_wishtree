package Written_Test2;

import java.util.Comparator;

public class TrainCom implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		if (o1.totalSeats < o2.totalSeats)
			return -1;
		else if (o1.totalSeats > o2.totalSeats)
			return 1;
		else
			return 0;
	}

}
