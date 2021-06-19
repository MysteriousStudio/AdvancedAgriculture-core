package tech.icedlab.advagri.annotation;


import tech.icedlab.advagri.block.AdvAgriBlocksEnum;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Block {
    AdvAgriBlocksEnum Path();
}
