package com.github.sathishsoundararajan.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AuthorizationPolicy {
	private String route;
	private List<AuthorizationPolicyClaim> claims = new ArrayList<>();
}
