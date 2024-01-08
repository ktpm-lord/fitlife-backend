package com.fitlife.app.dataclass.request;

import lombok.Data;

@Data
public class CustomExerciseRequest {
	private int time;
	private String difficulty;
	private int rep;
	private int weight;
	private Long exercise;

}
