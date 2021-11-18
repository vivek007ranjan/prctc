package com.Vivworld.www;

import java.util.Arrays;

public class StringBasics {
    public static void main(String[] args) {

       // char ch[] = new char[1073000000];
      //  Arrays.fill(ch,'a');
     //   String news = new String(ch);
        String S1 = "ABcbc";
        String S2 = new String("ABC");
        System.out.println(S1 + " " + S2);
        System.out.println(S1.charAt(4));
        System.out.println(S1.charAt(3));
        System.out.println(S1.chars());
        System.out.println(S1.codePointAt(3));
        System.out.println(S1.codePointBefore(4));
        System.out.println(S1.codePointCount(1,3));
    //    System.out.println(news);
        System.out.println(S1.codePoints());
        System.out.println(S1.compareTo(S2));
        System.out.println(S1.endsWith("c"));
        System.out.println(S1.equals(S2));

    }
}

/* String Methods


charAt(int index)
chars()
codePointAt(int index)
codePointBefore(int index)
codePointCount(int beginIndex, int endIndex)
codePoints()
compareTo(String anotherString)
compareToIgnoreCase(String str)
concat(String str)
contains(CharSequence s)
contentEquals(CharSequence cs)
contentEquals(StringBuffer sb)
copyValueOf(char[] data)
copyValueOf(char[] data, int offset, int count)
endsWith(String suffix)
equals(Object anObject)
equalsIgnoreCase(String anotherString)
format(String format, Object... args)
format(Locale l, String format, Object... args)
getBytes()
getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
getBytes(String charsetName)
getBytes(Charset charset)
getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
hashCode()
indexOf(int ch)
indexOf(int ch, int fromIndex)
indexOf(String str)
indexOf(String str, int fromIndex)
intern()
isBlank()
isEmpty()
join(CharSequence delimiter, CharSequence... elements)
join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
lastIndexOf(int ch)
lastIndexOf(int ch, int fromIndex)
lastIndexOf(String str)
lastIndexOf(String str, int fromIndex)
length()
lines()
matches(String regex)
offsetByCodePoints(int index, int codePointOffset)
regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
regionMatches(int toffset, String other, int ooffset, int len)
repeat(int count)
replace(char oldChar, char newChar)
replace(CharSequence target, CharSequence replacement)
replaceAll(String regex, String replacement)
replaceFirst(String regex, String replacement)
split(String regex)
split(String regex, int limit)
startsWith(String prefix)
startsWith(String prefix, int toffset)
strip()
stripLeading()
stripTrailing()
subSequence(int beginIndex, int endIndex)
substring(int beginIndex)
substring(int beginIndex, int endIndex)
toCharArray()
toLowerCase()
toLowerCase(Locale locale)
toString()
toUpperCase()
toUpperCase(Locale locale)
trim()
valueOf(boolean b)
valueOf(char c)
valueOf(char[] data)
valueOf(char[] data, int offset, int count)
valueOf(double d)
valueOf(float f)
valueOf(int i)
valueOf(long l)
valueOf(Object obj)
         */