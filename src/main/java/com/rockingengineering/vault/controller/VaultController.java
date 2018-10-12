/**
 * 
 */
package com.rockingengineering.vault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * 
 * @author naveen
 *
 * @date 23-Oct-2017
 */
@RefreshScope
@Api(value = "Vault Controller")
@RestController
public class VaultController {

	@Value("${client.pseudo.property}")
	private String pseudoProperty;

	@Value("${client.pseudo.property}")
	private String proeprtyFromVault;

	@GetMapping("/property")
	public ResponseEntity<String> getProperty() {
		return ResponseEntity.ok(pseudoProperty);
	}

	@GetMapping("/property/vault")
	public ResponseEntity<String> getPropertyFromVault() {
		return ResponseEntity.ok(proeprtyFromVault);
	}
}