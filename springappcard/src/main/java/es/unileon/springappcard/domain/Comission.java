package es.unileon.springappcard.domain;

import java.io.Serializable;

public class Comission implements Serializable{
	private static final long serialVersionUID = 1L;

    private String description;
    private Double comission;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getComission() {
        return comission;
    }
    
    public void setComission(Double comission) {
        this.comission = comission;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Comission: " + comission);
        return buffer.toString();
    }
}