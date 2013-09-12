package jgf.hmw.chm;

public class Book106ScoreandName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[][]={{12,34,56},{34,78,90,12}};
		for(int i=0;i<=score.length-1;i++)
		{
			for(int j=0;j<=score[i].length-1;j++)
			{
				System.out.print(score[i][j]);
			}
			System.out.println();
		}
	}

}
