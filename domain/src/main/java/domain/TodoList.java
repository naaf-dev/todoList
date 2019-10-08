package domain;

import java.util.Collections;
import java.util.List;

public class TodoList {
	List<String> listTask;

	public void add(String task) {
		listTask.add(task);
	}

	public List<String> getListTask() {
		return Collections.unmodifiableList(listTask);
	}
	
	

}
