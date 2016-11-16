
public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord(); //성적정보 new
		
		//3개까지의 정수만 출력함
		Observer dataSheetView = new DataSheetView(scoreRecord,5);
		Observer dataSorteView = new DataSortedView(scoreRecord);
		Observer dataMinMaxView = new DataMinMaxView(scoreRecord);
		
		scoreRecord.addObserver(dataSheetView);
		scoreRecord.addObserver(dataSorteView);
		scoreRecord.addObserver(dataMinMaxView);
		
		for(int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			
			scoreRecord.addScore(score);
		}
	}

}
