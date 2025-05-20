/**
@${date}
@02:26:50
@${year}
@${file_name}
@${package_name}
@${project_name}
@${autor}
 * 
 */
package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Games;

/**
 * 
 */
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	
	/**
	 * 
	 */
	public GameMinDTO() {
		super();
	}



	/**
	 * @param id
	 * @param title
	 * @param year
	 * @param imgUrl
	 * @param shortDescription
	 */
	public GameMinDTO(Games entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}



	/**
	 * @return the imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}



	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}
	
	
	

}
