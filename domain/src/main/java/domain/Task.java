package domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Task {
	
	private String title;
	private Status status;
	private LocalDate dateOfCreation;

}
