
package controleEntree;

import java.beans.*;
import java.io.Serializable;


public class Compteur implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    public static final String VALUE_PROPERTY = "compteur";
    
    private int compteur = 0;
    private boolean started;
    
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public Compteur() {
        started = false;
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getCompteur(){
        return this.compteur;
    }
    
    public void augmenter(){
        if(started){
            int old = this.compteur;
            this.compteur ++;
            propertySupport.firePropertyChange(VALUE_PROPERTY, old, this.compteur);
        }
        
    }
    
    public void diminuer(){
        if(started){
            int old = this.compteur;
            this.compteur --;
            propertySupport.firePropertyChange(VALUE_PROPERTY, old, this.compteur);    
        }
        
        
    }
    
    public void raz(){
            int old = this.compteur;
            this.compteur = 0;
            propertySupport.firePropertyChange(VALUE_PROPERTY, old, this.compteur);
    }
    
    public void start(){
        started = true;
    }
    public void stop(){
        started = false;
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
