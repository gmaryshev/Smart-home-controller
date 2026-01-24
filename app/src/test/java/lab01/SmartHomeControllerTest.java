package lab01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartHomeControllerTest {

    @Test
    void setTemp23RestrictionsEnabled() {
        SmartHomeController controller = new SmartHomeController(20, true);
        int newTemp = controller.setTemp(23);       
        assertEquals(23, newTemp);      
    }
    @Test
    void setTemp50RestrictionsEnabled() {
        SmartHomeController controller = new SmartHomeController(50, true);
        int newTemp = controller.setTemp(50);       
        assertEquals(50, newTemp);  
    }
    @Test
    void testGetTemp() {
        SmartHomeController controller = new SmartHomeController(23, false);
        int currentTemp = controller.getTemp(); 
        assertEquals(23, currentTemp);      

    }
    @Test
    void testGetRestrictions() {
        SmartHomeController controller = new SmartHomeController(23, false);
        boolean restrictions = controller.getRestrictions();
        assertFalse(restrictions);
    }
    @Test
    void testSetRestricitons() {
        SmartHomeController controller = new SmartHomeController(23, false);
        boolean restrictions = controller.setRestrictions(false);
        assertFalse(restrictions);
    }
    @Test
    void setTemp50RestrictionsDisabled() {
        SmartHomeController controller = new SmartHomeController(23, false);
        int newTemp = controller.setTemp(50);       
        assertEquals(50, newTemp); 
    }
    
    

    
}



