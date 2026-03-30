package com.cmlbay.javaadvancedlab.generics;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-30
 */
public class UnboundedWildcardExamples {

    public int getSize(List<?> items){
        return items.size();
    }

    public Object getFirstElement(List<?> items){
        return items.get(0);
    }
}
