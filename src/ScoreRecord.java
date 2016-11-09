import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private ArrayList<Integer> scores = new ArrayList<Integer>(); // 점수를 저장
	private DataSheetView dataSheetView;
	private DataSortedView dataSortedView;
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	public void setDataSortedView(DataSortedView dataSortedView) {
		this.dataSortedView = dataSortedView;
	}
	
	//새로운 점수를 추가하는 메소드
	public void addScore(int score) {
		scores.add(score); // 새로운 점수를 추가하고
		dataSheetView.update(); // scores(점수목록)이 변경됨을 통보함.
		dataSortedView.update();
	}
	
	public ArrayList<Integer> getScoreRecord() {
		return scores;
	}
}
