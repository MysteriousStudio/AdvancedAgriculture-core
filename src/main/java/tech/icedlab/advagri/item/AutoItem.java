package tech.icedlab.advagri.item;

import tech.icedlab.advagri.item.AdvAgriItemsEnum;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AutoItem {
    AdvAgriItemsEnum Path();
}
