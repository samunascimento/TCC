/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.vcs.types;

import java.util.ArrayList;
import java.util.List;

/**
 * Type used in the command diff
 *
 * @author gleiph
 */
public class FileDiff {

    private String filePathSource;
    private String filePathTarget;
    private List<LineInformation> lines;
    private List<String> arroba;
    private List<String> allMessage;

    public FileDiff() {
    	this.allMessage = new ArrayList<>();
        this.lines = new ArrayList<>();
        this.arroba = new ArrayList<>();
        this.filePathSource = "";
        this.filePathTarget = "";
    }

    public String getFilePathSource() {
        return filePathSource;
    }

    public void setFilePathSource(String filePathSource) {
        this.filePathSource = filePathSource;
    }

    public String getFilePathTarget() {
        return filePathTarget;
    }

    public void setFilePathTarget(String filePathTarget) {
        this.filePathTarget = filePathTarget;
    }

    public List<LineInformation> getLines() {
        return lines;
    }

    public void setLines(List<LineInformation> lines) {
        this.lines = lines;
    }

    public List<String> getArroba() {
        return arroba;
    }

    public void setArroba(String arroba) {
        this.arroba.add(arroba);
    }

	public List<String> getAllMessage() {
		return allMessage;
	}

	public void setAllMessage(List<String> allMessage) {
		this.allMessage = allMessage;
	}

}
