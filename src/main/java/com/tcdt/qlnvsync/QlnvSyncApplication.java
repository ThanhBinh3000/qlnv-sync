package com.tcdt.qlnvsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = { "com.tcdt.qlnvsync.entities", "com.tcdt.qlnvsync.table" })
public class QlnvSyncApplication {
	public static void main(String[] args) {
		SpringApplication.run(QlnvSyncApplication.class, args);
	}

}