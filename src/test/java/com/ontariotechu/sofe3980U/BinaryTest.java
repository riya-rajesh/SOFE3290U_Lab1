package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    //----------------------------OR FUNCTION-------------------------------------------------------

    /**
     * Test The OR functions with two binary numbers of the same length
     */
    @Test
    public void or1()
    {
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.orFunction(binary1,binary2);
        assertTrue( binary3.getValue().equals("1111"));
    }

    /**
     * Test The OR functions with two binary numbers, the length of the first argument is
     * greater than the second
     */
    @Test
    public void or2()
    {
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.orFunction(binary1,binary2);
        assertTrue( binary3.getValue().equals("1011"));
    }

    /**
     * Test The OR functions with two binary numbers, the
     * length of the first argument is less than the second
     */
    @Test
    public void or3()
    {
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.orFunction(binary1,binary2);
        assertTrue( binary3.getValue().equals("1011"));
    }


    //----------------------------AND FUNCTION-------------------------------------------------------

    /**
     * Test The AND functions with two binary numbers of the same length
     */
    @Test
    public void and1()
    {
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.andFunction(binary1,binary2);
        assertTrue( binary3.getValue().equals("1000"));
    }

    /**
     * Test The AND functions with two binary numbers, the length of the first argument is
     * greater than the second
     */
    @Test
    public void and2()
    {
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.andFunction(binary1,binary2);
        assertTrue( binary3.getValue().equals("10")); //original answer is 0010 but leading zeroes are removed
    }

    /**
     * Test The AND functions with two binary numbers, the
     * length of the first argument is less than the second
     */
    @Test
    public void and3()
    {
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.andFunction(binary1,binary2);
        assertTrue( binary3.getValue().equals("10")); //original answer is 0010 but leading zeroes are removed
    }

    //----------------------------MULTIPLY FUNCTION------------------------------------------------

    /**
     * Test The multiply functions with two binary numbers of the same length
     */
    @Test
    public void multiply1()
    {
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1111000"));
    }

    /**
     * Test The multiply functions with two binary numbers, the length of the first argument is
     * greater than the second
     */
    @Test
    public void multiply2()
    {
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("11110"));
    }

    /**
     * Test The multiply functions with two binary numbers, the
     * length of the first argument is less than the second
     */
    @Test
    public void multiply3()
    {
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("11110"));
    }











}
