package com.github.sathishsoundararajan.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class UrlPatternTreeNode {

	private UrlPatternTreeNode parent;
	private String key;
	private Map<String, UrlPatternTreeNode> paths = new HashMap<>();
	private Map<String, UrlPatternTreeNode> patterns = new HashMap<>();
	private boolean isUrlNode = false;
	private String urlClaimPattern;
	private List<String> userRoleClaim = new ArrayList<>();

	public UrlPatternTreeNode(UrlPatternTreeNode parent, String key) {
		this.parent = parent;
		this.key = key;
	}

	public UrlPatternTreeNode(UrlPatternTreeNode parent, String key, Map<String, UrlPatternTreeNode> paths,
			Map<String, UrlPatternTreeNode> patterns, boolean isLeafNode, String urlClaimPattern,
			List<String> userRoleClaim) {
		this(parent, key);
		this.paths = paths;
		this.patterns = patterns;
		this.isUrlNode = isLeafNode;
		this.urlClaimPattern = urlClaimPattern;
		this.userRoleClaim = userRoleClaim;
	}

}
