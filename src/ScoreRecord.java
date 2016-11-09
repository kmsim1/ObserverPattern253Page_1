import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private ArrayList<Integer> scores = new ArrayList<Integer>(); // ������ ����
	private DataSheetView dataSheetView;
	private DataSortedView dataSortedView;
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	public void setDataSortedView(DataSortedView dataSortedView) {
		this.dataSortedView = dataSortedView;
	}
	
	//���ο� ������ �߰��ϴ� �޼ҵ�
	public void addScore(int score) {
		scores.add(score); // ���ο� ������ �߰��ϰ�
		dataSheetView.update(); // scores(�������)�� ������� �뺸��.
		dataSortedView.update();
	}
	
	public ArrayList<Integer> getScoreRecord() {
		return scores;
	}
}
