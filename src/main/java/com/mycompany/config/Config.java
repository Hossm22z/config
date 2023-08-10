/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.config;

/**
 *
 * @author khaled
 */
public class Config {

    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String configurationData = configManager.getConfigurationData();
        System.out.println("Configuration data: " + configurationData);
        
        
       
        

        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        String anotherConfigurationData = anotherConfigManager.getConfigurationData();
        System.out.println("Another configuration data: " + anotherConfigurationData);  
    
    }
}
