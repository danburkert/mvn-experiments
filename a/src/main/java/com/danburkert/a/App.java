package com.danburkert.a;

import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App
{

  public static ImmutableList<String> getStrings() {
    return ImmutableList.of("foo", "bar", "baz");
  }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
