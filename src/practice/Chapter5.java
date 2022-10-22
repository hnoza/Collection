package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import practice.Task.DateComparator;

public class Chapter5 {

	private static final DateTimeFormatter fDate = DateTimeFormatter.ofPattern("yyyy年M月d日"); // 文字列→LocalDate
	private static final DateTimeFormatter fStr = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // LocalDate→文字列
	
	public static void main(String[] args) {
		
		// タスクの生成
		List<Task> taskList = new ArrayList<Task>();
		taskList.add(new Task(LocalDate.parse("2021年10月21日", fDate), "牛乳を買う。"));
		taskList.add(new Task(LocalDate.parse("2021年9月15日", fDate), "〇〇社面談。"));
		taskList.add(new Task(LocalDate.parse("2021年12月4日", fDate), "手帳を買う。"));
		taskList.add(new Task(LocalDate.parse("2021年8月10日", fDate), "散髪に行く。"));
		taskList.add(new Task(LocalDate.parse("2021年11月9日", fDate), "スクールの課題を解く。"));
		
		// 日付順に並び替え
		Collections.sort(taskList, new DateComparator());
		for (Task task : taskList) {
			System.out.print(task.getDate().format(fStr));
			System.out.print(":");
			System.out.println(task.getName());
		}
	}

//	/**
//	 * 日付の並び替え用コンパレータ
//	 *
//	 */
//	private static class DateComparator implements Comparator<Task>{
//
//		@Override
//		public int compare(Task o1, Task o2) {
//			return o1.date.compareTo(o2.date);
//		}
//		
//	}
}
