package cn.lv.hgstudy.pojo;

// Generated 2017-4-22 22:56:58 by Hibernate Tools 3.4.0.CR1

/**
 * Courseinfor generated by hbm2java
 */
public class Courseinfor implements java.io.Serializable {

	private Integer couinforid;
	private int couid;
	private String couOverview;
	private String couOutline;

	public Courseinfor() {
	}

	public Courseinfor(int couid) {
		this.couid = couid;
	}

	public Courseinfor(int couid, String couOverview, String couOutline) {
		this.couid = couid;
		this.couOverview = couOverview;
		this.couOutline = couOutline;
	}

	public Integer getCouinforid() {
		return this.couinforid;
	}

	public void setCouinforid(Integer couinforid) {
		this.couinforid = couinforid;
	}

	public int getCouid() {
		return this.couid;
	}

	public void setCouid(int couid) {
		this.couid = couid;
	}

	public String getCouOverview() {
		return this.couOverview;
	}

	public void setCouOverview(String couOverview) {
		this.couOverview = couOverview;
	}

	public String getCouOutline() {
		return this.couOutline;
	}

	public void setCouOutline(String couOutline) {
		this.couOutline = couOutline;
	}

}