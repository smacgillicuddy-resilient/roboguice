package roboguice.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AnnotationDatabase {
    //TODO add the additional packages here and load database impl classes.
    protected AnnotationDatabase() {}

    //TODO rename methods
    public abstract void fillAnnotationClassesAndFieldsNames(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToFieldSet);
    public abstract void fillInjectableClasses(HashSet<String> injectedClasses);


}