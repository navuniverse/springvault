/**
 * 
 */
package com.rockingengineering.vault.configuration;

import org.springframework.context.annotation.Import;
import org.springframework.vault.annotation.VaultPropertySource;
import org.springframework.vault.config.EnvironmentVaultConfiguration;

/**
 * @author naveen
 *
 * @date 15-Oct-2018
 */
@VaultPropertySource("secret/configclient")
@Import(EnvironmentVaultConfiguration.class)
public class VaultConfig {

	
}