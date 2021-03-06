package cn.lv.hgstudy.pojo;

// Generated 2017-1-3 19:38:48 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Video generated by hbm2java
 */
public class Video implements java.io.Serializable {

	private Integer vidId;
	private String vidPath;
	private String vidInfor;
	private String vidName;
	private String vidImg;
	private String time;
	private Double evaluate;
	private Integer jointid;
	
	public Video() {
	}

	public Video(String vidPath, String vidInfor, String vidName,
			String vidImg, String time, Double evaluate,int jointid) {
		this.vidPath = vidPath;
		this.vidInfor = vidInfor;
		this.vidName = vidName;
		this.vidImg = vidImg;
		this.time = time;
		this.evaluate = evaluate;
		this.jointid = jointid;
	}

	public Integer getVidId() {
		return this.vidId;
	}

	public void setVidId(Integer vidId) {
		this.vidId = vidId;
	}

	public String getVidPath() {
		return this.vidPath;
	}

	public void setVidPath(String vidPath) {
		this.vidPath = vidPath;
	}

	public String getVidInfor() {
		return this.vidInfor;
	}

	public void setVidInfor(String vidInfor) {
		this.vidInfor = vidInfor;
	}

	public String getVidName() {
		return this.vidName;
	}

	public void setVidName(String vidName) {
		this.vidName = vidName;
	}

	public String getVidImg() {
		return this.vidImg;
	}

	public void setVidImg(String vidImg) {
		this.vidImg = vidImg;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Double getEvaluate() {
		return this.evaluate;
	}

	public void setEvaluate(Double evaluate) {
		this.evaluate = evaluate;
	}

	public Integer getJointid() {
		return jointid;
	}

	public void setJointid(Integer jointid) {
		this.jointid = jointid;
	}
	
}
