package cn.edu.seu.ytw.bean.system;
import java.util.*;

/**
 * 
 */
public class Log {

	/**
     * 
     */
	public Log() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
     * 
     */
	private int id;

	/**
     * 
     */
	private String user;

	/**
     * 
     */
	private Date time;

	/**
     * 
     */
	private String ip;

	/**
     * 
     */
	private String title;

}