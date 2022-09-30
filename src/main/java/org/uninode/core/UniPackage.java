/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

import java.util.List;

public interface UniPackage {
    String getName();
    UniDomain getDomain();
    List<UniClass> getClasses();

}
