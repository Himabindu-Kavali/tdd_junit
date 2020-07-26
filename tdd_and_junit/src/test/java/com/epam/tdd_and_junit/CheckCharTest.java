package com.epam.tdd_and_junit;

import org.junit.jupiter.api.Test;


	
	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.BeforeEach;
	

	class CheckCharTest {
		/*TODO list for my feature : remove 'A' if it is present in first two characters of the string.
		 * 1. First_A chars - : ABCD => BCD - success
		 * 2. Second_A chars - : BACD => BCD
		 * 3. First_A_Second_A chars - : AACD => CD
		 * 4. Zero_A chars- : BBAA => BBAA
		 * 5. OnlyFirst2As - : AABAA => BAA - success
		 */
		
		CheckChar firstA;
		
		@BeforeEach
		void setUp()
		{
			 firstA = new CheckChar();
		}
		
		@Test
		void test_First_A() 
		{
			assertEquals("BCD",firstA.removeA("ABCD"));
		}
		
		@Test
		void test_Second_A() 
		{
			assertEquals("BCD",firstA.removeA("BACD"));
		}
		
		@Test
		void test_First_A_Second_A() 
		{
			assertEquals("CD",firstA.removeA("AACD"));
		}
		
		@Test
		void test_Zero_A() 
		{
			assertEquals("BBAA",firstA.removeA("BBAA"));
		}
		
		@Test
		void test_OnlyFirst2As() 
		{
			assertEquals("BAA",firstA.removeA("AABAA"));
		}
		
	}


