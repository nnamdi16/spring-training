package spring.setterInjection.factoryBeanDemo;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class EmployeeFactoryBean extends AbstractFactoryBean<Object> {
    //This method would be called bt the container to create new instance

    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    //This method would be called by container to create new instances.
    @Override
    protected Object createInstance() throws Exception {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(-1);
        employeeDTO.setFirstName("Dummy");
        employeeDTO.setLastName("Dummy");
        employeeDTO.setDesignation(designation);
        return employeeDTO;
    }

    //This method is required for autowiring to work properly

    @Override
    public Class<EmployeeDTO> getObjectType() {
        return EmployeeDTO.class;
    }
}
