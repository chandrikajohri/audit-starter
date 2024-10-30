package com.bgarage.ims.audit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class BGarageAuditConfig {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new BGarageAuditorAware();
	}
	
}
