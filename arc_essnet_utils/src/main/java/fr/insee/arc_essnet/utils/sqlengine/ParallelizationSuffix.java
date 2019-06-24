package fr.insee.arc_essnet.utils.sqlengine;

import org.springframework.beans.factory.annotation.Autowired;

import fr.insee.arc_essnet.utils.ressourceUtils.PropertiesHandler;

public class ParallelizationSuffix
{
    
    @Autowired
    private static PropertiesHandler propertiesHandler;
    
    private static String TN = propertiesHandler.getTN();
    
    private static final ThreadLocal<String> INSTANCE = ThreadLocal.withInitial(() -> TN);

    public static final String get()
    {
        return INSTANCE.get();
    }
}