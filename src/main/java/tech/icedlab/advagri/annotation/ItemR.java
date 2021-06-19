package tech.icedlab.advagri.annotation;

import tech.icedlab.advagri.item.AdvAgriItemsEnum;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ItemR {
    AdvAgriItemsEnum Path();
}
