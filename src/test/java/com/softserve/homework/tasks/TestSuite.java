package com.softserve.homework.tasks;

import com.softserve.homework.tasks.imp.ExchangeValueTest;
import com.softserve.homework.tasks.imp.FindValueTest;
import com.softserve.homework.tasks.imp.IncrementValueTest;
import com.softserve.homework.tasks.imp.TaskTest;
import com.softserve.homework.tasks.imp.dmytro.NumberReverserTest;
import com.softserve.homework.tasks.imp.dmytro
        .TheBiggestSumOfDivisorsFinderTest;
import com.softserve.homework.tasks.imp.dmytro.ThreeInQuadraticFormCheckerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({NumberReverserTest.class,
        TheBiggestSumOfDivisorsFinderTest.class, ThreeInQuadraticFormCheckerTest
        .class, ExchangeValueTest.class, FindValueTest.class,
        IncrementValueTest.class, TaskTest.class, com.softserve.homework
        .tasks.imp.TestClosestBiggerPowOf2
        .class, com.softserve.homework.tasks.imp.TestPresentAsPows.class})
public class TestSuite {}
