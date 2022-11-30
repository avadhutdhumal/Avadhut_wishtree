package Written_Test2;

public class Ques3 {
	/* 3.Print 1 2 3 4 5 one below the other but using recursive method only */
	public static void main(String[] args) {

		Ques3 q = new Ques3();
		q.print(5, 1);

	}

	int print(int y, int i) {
		if (i <= y)
		{
			System.out.print(i + " ");
			return (print(y, ++i));
		}
		return 1;
	}

}
