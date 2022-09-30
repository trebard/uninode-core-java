/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

import java.util.List;

public interface UniDomain {
    String getName();
    List<UniPackage> getPackages();
}
