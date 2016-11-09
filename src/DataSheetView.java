import java.util.ArrayList;

public class DataSheetView {
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	//점수의 변경을 통보 받는 메소드
	public void update() {
		ArrayList<Integer> record = scoreRecord.getScoreRecord(); //점수를 조회하고
		displayScores(record, viewCount); // 조회된 점수를 viewCount 만큼 출력함.
	}
	
	public void displayScores(ArrayList<Integer> record, int viewCount) {
		System.out.print("List of " + viewCount + " entries : ");
		for(int i=0; i < viewCount && i < record.size(); i++) {
			System.out.print(record.get(i) + " ");
		}
		System.out.println();
	}
}
