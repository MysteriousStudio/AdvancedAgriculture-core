package tech.icedlab.advagri.annotation;

import tech.icedlab.advagri.item.AdvAgriToolsAndWeaponsEnum;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ToolRegistrationTarget {
    AdvAgriToolsAndWeaponsEnum Path();
}
