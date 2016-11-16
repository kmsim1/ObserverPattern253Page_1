import java.util.ArrayList;
import java.util.List;
/*
 * ���ο� �������� ���� ���ѵ� 
 * scoreRecord Ŭ������ �ִ� �ڵ�� ��ġ�� �ʴ´�.
 */
public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>(); // ������ ����
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
	
	//���ο� ������ �߰��ϴ� �޼ҵ� ���������� �����Ų �Ŀ� �������鿡�� ������ ������� ��, update�������
	public void addScore(int score) {
		scores.add(score); // ���ο� ������ �߰��ϰ�
		/*dataSheetView.update(); // scores(�������)�� ������� �뺸��.
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
