package com.sufyan97.learn_lombok.withlombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
	@NonNull private Long userId;
	@NonNull private String email;
	private String birthPlace;
	private String oldEmail;
	
	public void replaceEmail(@NonNull String newEmail) {
		this.oldEmail = oldEmail + "||" + this.email;
		this.email = newEmail;
	}
}
