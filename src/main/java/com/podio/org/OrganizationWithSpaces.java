package com.podio.org;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.podio.space.SpaceMini;

public class OrganizationWithSpaces extends OrganizationMini {

	/**
	 * <code>"true"</code> if the user has the right to create new spaces,
	 * <code>"false"</code> otherwise
	 */
	private String createRight;

	/**
	 * The list of spaces in the organization that the user has access to
	 */
	private List<SpaceMini> spaces;

	
	private List<String> rights;
	
	@JsonProperty("rights")
	public List<String> getRights() {
		return rights;
	}
	
	@JsonProperty("rights")
	public void setRights(List<String> rights) {
		this.rights = rights;
	}
	
	/**
	 * 
	 * @return true, if current user has the right to create new space in this org; false otherwise
	 */
	public boolean canAddSpace() {
		return rights.contains("add_space");
	}

	public List<SpaceMini> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<SpaceMini> spaces) {
		this.spaces = spaces;
	}
}
