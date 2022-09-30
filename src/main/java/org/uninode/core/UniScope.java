/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

public interface UniScope<ScopeType extends UniScope, C extends UniClass> {
    ScopeType createChild(ScopeType... parents);
    C getEdgeClass(Object o);
    C getNamedClass(String name, boolean checkParents);
    C addClass(C c);
    C createClass(String name, C... superClasses);
}
