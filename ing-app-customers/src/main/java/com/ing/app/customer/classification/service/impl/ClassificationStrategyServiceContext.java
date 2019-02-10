package com.ing.app.customer.classification.service.impl;

import com.ing.app.customer.classification.service.ClassificationStrategyService;
import com.ing.app.model.Customer;

public class ClassificationStrategyServiceContext {

	private ClassificationStrategyService classificationStrategyService;

	public ClassificationStrategyServiceContext(ClassificationStrategyService classificationStrategyService) {
		this.classificationStrategyService = classificationStrategyService;
	}
	
	public void executeClassificationStrategyService(Customer customer) {
		classificationStrategyService.checkClassification(customer);
	}

}
