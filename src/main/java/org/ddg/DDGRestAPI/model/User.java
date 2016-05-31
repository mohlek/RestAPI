package org.ddg.DDGRestAPI.model;

import java.util.List;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

/**
 * <b>User</b><br>
 * <p>
 * Beschreibung
 * </p>
 *
 * @author maurice (May 30, 2016)
 */
@JsonApiResource(type = "users")
public class User {

	@JsonApiId
	private String			id;

	private String			email;

	private String			nickname;

	private String			firstName;

	private String			lastName;

	private List<String>	interests;

	/**
	 *
	 */
	public User() {
	}

	/**
	 * @param id
	 * @param email
	 * @param nickname
	 * @param firstName
	 * @param lastName
	 * @param interests
	 */
	public User(String id, String email, String nickname, String firstName, String lastName, List<String> interests) {
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.firstName = firstName;
		this.lastName = lastName;
		this.interests = interests;
	}

	/**
	 * Liefert den Wert aus <b>id</b>
	 *
	 * @return {@link String}-Wert aus id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setzt den Wert für <b>id</b>
	 *
	 * @param id
	 *            {@link String}-Wert für id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Liefert den Wert aus <b>email</b>
	 *
	 * @return {@link String}-Wert aus email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setzt den Wert für <b>email</b>
	 *
	 * @param email
	 *            {@link String}-Wert für email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Liefert den Wert aus <b>nickname</b>
	 *
	 * @return {@link String}-Wert aus nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * Setzt den Wert für <b>nickname</b>
	 *
	 * @param nickname
	 *            {@link String}-Wert für nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * Liefert den Wert aus <b>firstName</b>
	 *
	 * @return {@link String}-Wert aus firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setzt den Wert für <b>firstName</b>
	 *
	 * @param firstName
	 *            {@link String}-Wert für firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Liefert den Wert aus <b>lastName</b>
	 *
	 * @return {@link String}-Wert aus lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setzt den Wert für <b>lastName</b>
	 *
	 * @param lastName
	 *            {@link String}-Wert für lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Liefert den Wert aus <b>interests</b>
	 *
	 * @return {@link List}-Wert aus interests
	 */
	public List<String> getInterests() {
		return interests;
	}

	/**
	 * Setzt den Wert für <b>interests</b>
	 *
	 * @param interests
	 *            {@link List}-Wert für interests
	 */
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		User user = (User) o;

		return !(id != null ? !id.equals(user.id) : user.id != null);

	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
