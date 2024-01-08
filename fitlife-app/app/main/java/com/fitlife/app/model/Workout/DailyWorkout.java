package com.fitlife.app.model.Workout;

import java.util.List;

import com.fitlife.app.model.Session.Session;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyWorkout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // This indicates auto-generation of IDs

	private Long id;

	private String name;
	private String description;
	private Long time;
	@ManyToOne
	@JoinColumn(name = "workout_plan_id",referencedColumnName = "id")
	private WorkoutPlan workoutPlan;

	@OneToMany(
			mappedBy = "dailyWorkouts",
			orphanRemoval = true,
			cascade = CascadeType.ALL
	)
	private List<Session> sessions;
}
