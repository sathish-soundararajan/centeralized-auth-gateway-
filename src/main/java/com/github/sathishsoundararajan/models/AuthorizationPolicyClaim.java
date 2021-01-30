package com.github.sathishsoundararajan.models;

import java.util.List;

import lombok.Data;

@Data
public class AuthorizationPolicyClaim {

	private String urlPattern;
	private String urlClaim;
	private List<String> userRoleClaim;

}
