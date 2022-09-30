/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

public interface UniContainer {
    void setEdgeValue(String name, Object value);
    boolean hasEdgeValue(String name);
    Object getEdgeValue(String name);
}
