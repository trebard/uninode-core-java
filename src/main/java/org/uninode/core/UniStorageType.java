/*
 * Copyright (c) 2022 Demagic AB.
 * All rights reserved.
 */

package org.uninode.core;

public enum UniStorageType {
    BIG_INT,
    BOOLEAN,
    CHAR,
    CHAR_CASE_INSENSITIVE,
    DATE,
    FLOAT,
    INT,
    JSON,
    LONGTEXT,
    NUMERIC,
    NUMERIC_CHAR, // number represented as a string
    TEXT,
    TEXT_BOOL, // boolean saved as "0" or "1"
    TIME,
    TIMESTAMP,
    TIMESTAMP_UTC
}