import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataMinMaxView implements Observer {
	private ScoreRecord scoreRecord;

	public DataMinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		// ������ �����ͼ�
		List<Integer> record = scoreRecord.getScoreRecord();
		List<Integer> sortList = new ArrayList<Integer>();
		sortList = record;
		// ����Ѵ�.
		displayScores(sortList);
	}

	public void displayScores(List<Integer> record) {
		int min = Collections.min(record);
		int max = Collections.max(record);

		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		System.out.println();
	}
}
