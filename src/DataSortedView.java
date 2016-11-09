import java.util.ArrayList;
import java.util.Collections;

public class DataSortedView {
	private ScoreRecord scoreRecord;
	
	public DataSortedView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}
	
	public void update() {
		//������ �����ͼ�
		ArrayList<Integer> record = scoreRecord.getScoreRecord();
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		sortList = record;
		//����Ѵ�.
		displayScores(sortList);
	}
	
	public void displayScores(ArrayList<Integer> record) {
//		int min = Collections.min(record);
//		int max = Collections.max(record);
		Collections.sort(record);
		
//		System.out.println("Min : " + min);
//		System.out.println("Max : " + max);
		System.out.println(record);
		System.out.println();
	}
}
