package domain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TodoListSpec {
	
	@Test
	void todolist_contain_the_new_task_added() {
		TodoList todolist = new TodoList();
		
		todolist.add("Titre_task");
		List<String> listTask = todolist.getListTask();
		
		assertTrue(listTask.contains("Titre_task"));
	}
	

}
