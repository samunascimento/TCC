package br.ufjf.dcc.gmr.core.mergenature.model;

import java.util.List;

/**
 * Class to record basic info about Git projects and store a list of all merges
 *
 * @author João Pedro Lima
 * @since 10-10-2020
 */
public class Project {

    private int id;
    private String name;
    private String url;
    private String organization;
    List<Merge> merges;

}
