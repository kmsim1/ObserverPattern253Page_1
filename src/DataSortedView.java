import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSortedView implements Observer {
	private ScoreRecord scoreRecord;
	
	public DataSortedView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}
	
	public void update() {
		//점수를 가져와서
		List<Integer> record = scoreRecord.getScoreRecord();
		List<Integer> sortList = new ArrayList<Integer>();
		sortList = record;
		//출력한다.
		displayScores(sortList);
	}
	
	public void displayScores(List<Integer> record) {
//		int min = Collections.min(record);
//		int max = Collections.max(record);
		Collections.sort(record);
		
//		System.out.println("Min : " + min);
//		System.out.println("Max : " + max);
		System.out.println(record);
		System.out.println();
	}
}
