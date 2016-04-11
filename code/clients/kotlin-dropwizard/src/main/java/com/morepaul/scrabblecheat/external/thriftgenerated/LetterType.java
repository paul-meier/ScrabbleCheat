package com.morepaul.scrabblecheat.external.thriftgenerated;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Tells us what kind of letter is in the tile, as this affects scoring.
 * If the tile is empty, we state it here.
 */
public enum LetterType implements org.apache.thrift.TEnum {
  CHARACTER(0),
  WILDCARD(1),
  EMPTY(2);

  private final int value;

  private LetterType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static LetterType findByValue(int value) { 
    switch (value) {
      case 0:
        return CHARACTER;
      case 1:
        return WILDCARD;
      case 2:
        return EMPTY;
      default:
        return null;
    }
  }
}
