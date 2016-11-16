import java.util.ArrayList;
import java.util.List;
/*
 * 새로운 옵저버를 적용 시켜도 
 * scoreRecord 클래스의 있는 코드는 고치지 않는다.
 */
public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); // 점수를 저장
	private List<Observer> observers = new ArrayList<Observer>();
	
	/*private DataSheetView dataSheetView;
	private DataSortedView dataSortedView;*/
	/*public void setDataSheetView(DataSheetView dataSheetView) {
	this.dataSheetView = dataSheetView;
}

public void setDataSortedView(DataSortedView dataSortedView) {
	this.dataSortedView = dataSortedView;
}*/
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	//새로운 점수를 추가하는 메소드 성적정보를 변경시킨 후에 옵저버들에게 통지를 해줘야함 즉, update해줘야함
	public void addScore(int score) {
		scores.add(score); // 새로운 점수를 추가하고
		/*dataSheetView.update(); // scores(점수목록)이 변경됨을 통보함.
		dataSortedView.update();*/
		notifyObservers();
	}
	
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update();
		}
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
}
