package practice;
import java.time.LocalDate;
import java.util.Comparator;

class Task{
	private LocalDate date;
	private String name;
	
	Task(LocalDate date, String name) {
		this.date = date;
		this.name = name;
	}
	
	LocalDate getDate() {
		return date;
	}
	
	String getName() {
		return name;
	}
	
	/**
	 * 日付の並び替え用コンパレータ
	 *
	 */
	 static class DateComparator implements Comparator<Task>{

		@Override
		public int compare(Task o1, Task o2) {
			return o1.date.compareTo(o2.date);
		}
		
	}
}
