  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.config;

/**
 *
 * @author khaled
 */
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configurationData;

    private ConfigurationManager() {
        configurationData = "Sample configuration";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        
        return instance;
    }

    public String getConfigurationData() {
        return configurationData;
    }
}
