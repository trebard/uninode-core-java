/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

import java.util.List;
import java.util.Map;

public interface UniClass<Property extends UniProperty> extends UniType {
    String getName();
    Property getProperty(String name);
    List<Map<String, Object>> getContent();
}
