package com.fehead.spring.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//����bean�Ķ���
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand,500000,300);
	}

	//����bean�����ͣ�.class��
	@Override
	public Class<Car> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	//�ж��Ƿ��ǵ���
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
