package com.iisi.web.test;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

 
@Controller
@ViewScoped
public class SelectionView implements Serializable {
     
    private List<Car> cars1;
    private List<Car> cars2;
    private List<Car> cars3;
    private List<Car> cars4;
    private List<Car> cars5;
    private List<Car> cars6;
    private Car selectedCar;
    private List<Car> selectedCars;
    
    private boolean checkAll;
    
//    @ManagedProperty("#{carService}")
    @Autowired
    private CarService service;
     
    @PostConstruct
    public void init() {
        cars1 = service.createCars(10);
        cars2 = service.createCars(10);
        cars3 = service.createCars(10);
        cars4 = service.createCars(10);
        cars5 = service.createCars(10);
        cars6 = service.createCars(10);
    }
    
    public void checkAllListener(){
//        for (int i = start; i < end; i++) {
//            if (i < dto.getRl01622SDPList().size()) {
//                dto.getRl01622SDPList().get(i).setRegStatus(checkAll);
//            }
//        }
    	
    	for(int i=0;i<cars6.size();i++){
    		cars6.get(i).setStatus(checkAll);
    	}
    	
    }
    
    public List<Car> getCars1() {
        return cars1;
    }
 
    public List<Car> getCars2() {
        return cars2;
    }
 
    public List<Car> getCars3() {
        return cars3;
    }
 
    public List<Car> getCars4() {
        return cars4;
    }
 
    public List<Car> getCars5() {
        return cars5;
    }
 
    public List<Car> getCars6() {
        return cars6;
    }
     
    public void setService(CarService service) {
        this.service = service;
    }
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
 
    public List<Car> getSelectedCars() {
        return selectedCars;
    }
 
    public void setSelectedCars(List<Car> selectedCars) {
        this.selectedCars = selectedCars;
    }
     
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Car Unselected", ((Car) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public boolean isCheckAll() {
		return checkAll;
	}

	public void setCheckAll(boolean checkAll) {
		this.checkAll = checkAll;
	}
}