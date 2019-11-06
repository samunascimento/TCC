package br.ufjf.dcc.gmr.core.conflictanalysis;

import java.util.List;

public class ConflictRegion {
	private List<String> v1;
	private List<String> v2;
	private String file;
	private int v1StartLine;
	private int v1FinalLine;
	private int v2StartLine;
	private int v2FinalLine;
	
	public List<String> getV1() {
		return v1;
	}
	public void setV1(List<String> v1) {
		this.v1 = v1;
	}
	public List<String> getV2() {
		return v2;
	}
	public void setV2(List<String> v2) {
		this.v2 = v2;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getV1StartLine() {
		return v1StartLine;
	}
	public void setV1StartLine(int v1StartLine) {
		this.v1StartLine = v1StartLine;
	}
	public int getV1FinalLine() {
		return v1FinalLine;
	}
	public void setV1FinalLine(int v1FinalLine) {
		this.v1FinalLine = v1FinalLine;
	}
	public int getV2StartLine() {
		return v2StartLine;
	}
	public void setV2StartLine(int v2StartLine) {
		this.v2StartLine = v2StartLine;
	}
	public int getV2FinalLine() {
		return v2FinalLine;
	}
	public void setV2FinalLine(int v2FinalLine) {
		this.v2FinalLine = v2FinalLine;
	}
	void clearAllAttributes() {
		this.file = null;
		this.v1.clear();
		this.v2.clear();
	}
}
