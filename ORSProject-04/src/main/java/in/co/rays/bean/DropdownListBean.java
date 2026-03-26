package in.co.rays.bean;

/**
 * DropdownList interface is implemented by Beans those are used to create drop
 * down list on HTML pages
 * 
 * @author Rohit Rajpoot 
 * @version 1.0 Copyright (c) Rohit Rajpoot 
 * 
 */
public interface DropdownListBean {

	/**
	 * Returns key of list element
	 * 
	 * @return key
	 */
	public String getKey();

	/**
	 * Returns display text of list element
	 * 
	 * @return value
	 */
	public String getValue();

}
