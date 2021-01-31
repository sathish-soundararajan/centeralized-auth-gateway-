package com.github.sathishsoundararajan.service;

import java.io.UnsupportedEncodingException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.springframework.stereotype.Service;

@Service
public class JWTService {

	private static final String ISSUER_NAME = "Sathish soundararajan";
	private Algorithm algorithm;

	public JWTService() throws IllegalArgumentException, UnsupportedEncodingException {
		algorithm = Algorithm.HMAC512("test token");
	}

	public DecodedJWT verifyToken(String token) {
		final JWTVerifier jwtVerifier = JWT.require(algorithm).withIssuer(ISSUER_NAME).build();
		try {
			return jwtVerifier.verify(token);
		} catch (JWTVerificationException exception) {
			exception.printStackTrace();
		}
		return null;
	}
}
