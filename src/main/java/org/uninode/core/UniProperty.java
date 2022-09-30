/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

public interface UniProperty<C extends UniClass, T extends UniType> {
    String getName();
    T getValueType();
    void setUniClass(C c);
    C getUniClass();
    C getValueClass();
}
