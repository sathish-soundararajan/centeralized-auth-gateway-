package com.github.sathishsoundararajan.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
	private Long userId;
	private String userRole;
	private String userType;
}
