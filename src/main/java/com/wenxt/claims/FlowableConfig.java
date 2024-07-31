package com.wenxt.claims;

import java.io.IOException;
import java.util.Arrays;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.DeploymentBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class FlowableConfig {
	
	 @Bean
	    public ProcessEngine processEngine() {
	        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration()
	            .setJdbcUrl("jdbc:oracle:thin:@//192.168.1.80:1521/orcl")
	            .setJdbcUsername("LIFE_DEV")
	            .setJdbcPassword("LIFE_DEV")
	            .setJdbcDriver("oracle.jdbc.OracleDriver")
	            .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

	        return cfg.buildProcessEngine();
	    }

	    @Bean
	    public RepositoryService repositoryService(ProcessEngine processEngine) {
	        return processEngine.getRepositoryService();
	    }

	    @Bean
	    public RuntimeService runtimeService(ProcessEngine processEngine) {
	        return processEngine.getRuntimeService();
	    }

	    @Bean
	    public TaskService taskService(ProcessEngine processEngine) {
	        return processEngine.getTaskService();
	    }

	    @Bean
	    public Deployment deployProcessDefinition(RepositoryService repositoryService) {
	    	DeploymentBuilder deploymentBuilder = repositoryService.createDeployment();

	    	 String processDir = "classpath:processes/*.bpmn20.xml";

	         try {
	             // Use PathMatchingResourcePatternResolver to find all BPMN files in the classpath
	             PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	             Resource[] resources = resolver.getResources(processDir);

	             Arrays.stream(resources)
	                 .forEach(resource -> {
	                     try {
	                         deploymentBuilder.addInputStream(resource.getFilename(), resource.getInputStream());
	                     } catch (IOException e) {
	                         throw new RuntimeException("Failed to read resource: " + resource.getFilename(), e);
	                     }
	                 });

	         } catch (IOException e) {
	             e.printStackTrace();
	             throw new RuntimeException("Failed to deploy process definitions", e);
	         }

	         return deploymentBuilder.deploy();
	    }

}

