package com.danburkert.a;

import com.google.common.collect.ImmutableList;

/**
 *
 */
public abstract class SPI {

  public ImmutableList<String> getStrings() {
    return ImmutableList.of("foo", "bar", "baz");
  }

  public abstract void setStrings(ImmutableList<String> strings);
}
