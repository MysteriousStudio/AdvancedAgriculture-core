package tech.icedlab.advagri.block;


import tech.icedlab.advagri.block.AdvAgriBlocksEnum;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AutoBlock {
    AdvAgriBlocksEnum Path();
}
