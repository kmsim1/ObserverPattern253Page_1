
public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord(); //�������� new
		
		//3�������� ������ �����
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
