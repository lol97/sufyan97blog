package com.sufyan97.learn_lombok.withoutlombok;

public class User {
	private Long userId;
	private String email;
	private String birthPlace;
	private String oldEmail;

	public User(Long userId, String email, String birthPlace, String oldEmail) {
		if (userId == null)
			throw new NullPointerException("userId is marked non-null but is null");
		if (email == null)
			throw new NullPointerException("email is marked non-null but is null");
		this.userId = userId;
		this.email = email;
		this.birthPlace = birthPlace;
		this.oldEmail = oldEmail;
	}

	public User() {
	}

	public void setUserId(Long userId) {
		if (userId == null)
			throw new NullPointerException("userId is marked non-null but is null");
		this.userId = userId;
	}

	public void setEmail(String email) {
		if (email == null)
			throw new NullPointerException("email is marked non-null but is null");
		this.email = email;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getEmail() {
		return this.email;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public String getOldEmail() {
		return this.oldEmail;
	}

	public void replaceEmail(String newEmail) {
		if (newEmail == null)
			throw new NullPointerException("newEmail is marked non-null but is null");
		this.oldEmail = this.oldEmail + "||" + this.oldEmail;
		this.email = newEmail;
	}
}
