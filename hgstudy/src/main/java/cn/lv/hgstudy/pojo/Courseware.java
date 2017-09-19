package cn.lv.hgstudy.pojo;

// Generated 2017-1-3 19:38:48 by Hibernate Tools 3.4.0.CR1

/**
 * Courseware generated by hbm2java
 */
public class Courseware implements java.io.Serializable {

	private Integer fileId;
	private String fileName;
	private String filePath;
	private String fileInfor;
	private String time;
	private Integer couId;
	private String uploader;

	public Courseware() {
	}

	public Courseware(String fileName, String filePath, String fileInfor,
			String time, Integer couId, String uploader) {
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileInfor = fileInfor;
		this.time = time;
		this.couId = couId;
		this.uploader = uploader;
	}

	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileInfor() {
		return this.fileInfor;
	}

	public void setFileInfor(String fileInfor) {
		this.fileInfor = fileInfor;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getCouId() {
		return this.couId;
	}

	public void setCouId(Integer couId) {
		this.couId = couId;
	}

	public String getUploader() {
		return this.uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

}
