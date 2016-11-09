
public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		//3개까지의 정수만 출력함
		DataSheetView dataSheetView = new DataSheetView(scoreRecord,5);
		DataSortedView dataSortedView = new DataSortedView(scoreRecord);
		
		scoreRecord.setDataSheetView(dataSheetView);
		scoreRecord.setDataSortedView(dataSortedView);
		
		for(int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			
			scoreRecord.addScore(score);
		}
	}

}
