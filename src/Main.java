
public class Main {
	public static void main(String[] args) {
		Utils utils = new Utils();
		String resp = utils.loadUserloggedInData();
		if (!resp.isEmpty()) {
			Home hm = new Home();
			hm.setVisible(true);
		} else {
			SignIn si = new SignIn();
			si.setVisible(true);
		}

	}
}
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Vector;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Assuming you have a Vector<Vector<String>> from your database
//        Vector<Vector<String>> dataList = getDataListFromDatabase();
//        Vector<Vector<String>> dataList1 = dataList;
//        // Schedule tasks
//        scheduleTasks(dataList1);
//
//        // Display the scheduled tasks
//        for (Vector<String> task : dataList1) {
//            System.out.println(task);
//        }
//    }
//
//    public static void scheduleTasks(Vector<Vector<String>> dataList) {
//        // Priority Scheduling
////        Collections.sort(dataList, Comparator.comparing(task -> task.get(6)));
//        Collections.sort(dataList, new PriorityComparator());
//        // Deadline Scheduling within the same priority
////        Collections.sort(dataList, Comparator.comparing(task -> task.get(4)));
//    }
//
//    // Replace this method with your database retrieval logic
//    private static Vector<Vector<String>> getDataListFromDatabase() {
//        Vector<Vector<String>> dataList = new Vector<>();
//
//        // Sample tasks (replace with database query)
//        Vector<String> task1 = new Vector<>(List.of("1", "Task1", "Type1", "2023-01-01", "2023-01-06", "InProgress", "High", "Description1"));
//        Vector<String> task2 = new Vector<>(List.of("2", "Task2", "Type2", "2023-01-05", "2023-01-08", "Todo", "Medium", "Description2"));
//        Vector<String> task3 = new Vector<>(List.of("3", "Task3", "Type3", "2023-01-02", "2023-01-07", "Done", "High", "Description3"));
//        Vector<String> task4 = new Vector<>(List.of("4", "Task4", "Type4", "2023-01-02", "2023-01-13", "Done", "Low", "Description3"));
//
//
//        dataList.add(task1);
//        dataList.add(task2);
//        dataList.add(task3);
//        dataList.add(task4);
//        return dataList;
//    }
//}
//class PriorityComparator implements Comparator<Vector<String>> {
//
//    private static final List<String> PRIORITY_ORDER = List.of("Medium", "Low", "High");
//
//    @Override
//    public int compare(Vector<String> task1, Vector<String> task2) {
//    	String priority1 = task1.get(6);  // Assuming priority is at index 6
//        String priority2 = task2.get(6);
//
//        // Compare based on priority first
//        int priorityComparison = Integer.compare(PRIORITY_ORDER.indexOf(priority1), PRIORITY_ORDER.indexOf(priority2));
//        
//        if (priorityComparison != 0) {
//            return priorityComparison;  // If priorities are different, return the comparison result
//        }
//
//        // If priorities are the same, compare based on deadlines
//        String deadline1 = task1.get(4);  // Assuming deadline is at index 4
//        String deadline2 = task2.get(4);
//
//        // Compare based on deadlines
//        return deadline1.compareTo(deadline2);
//    }
//}