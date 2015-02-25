/*
 * Copyright (C) 2014 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.i18n;


import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static com.neovisionaries.i18n.CountryCode.getByCode;
import static org.junit.Assert.*;


public class CountryCodeTest
{
    @Test
    public void test1()
    {
        List<CountryCode> list = CountryCode.findByName(".*United.*");

        assertEquals(6, list.size());

        // AE: United Arab Emirates
        assertTrue(list.contains(CountryCode.AE));

        // GB: United Kingdom
        assertTrue(list.contains(CountryCode.GB));

        // TZ: Tanzania, United Republic of
        assertTrue(list.contains(CountryCode.TZ));

        // UK: United Kingdom
        assertTrue(list.contains(CountryCode.UK));

        // UM: United States Minor Outlying Islands
        assertTrue(list.contains(CountryCode.UM));

        // US: United States
        assertTrue(list.contains(CountryCode.US));
    }


    @Test
    public void test2()
    {
        assertSame(Locale.CANADA, CountryCode.CA.toLocale());
    }


    @Test
    public void test3()
    {
        assertSame(Locale.CHINA, CountryCode.CN.toLocale());
    }


    @Test
    public void test4()
    {
        assertSame(Locale.GERMANY, CountryCode.DE.toLocale());
    }


    @Test
    public void test5()
    {
        assertSame(Locale.FRANCE, CountryCode.FR.toLocale());
    }


    @Test
    public void test6()
    {
        assertSame(Locale.UK, CountryCode.GB.toLocale());
    }


    @Test
    public void test7()
    {
        assertSame(Locale.ITALY, CountryCode.IT.toLocale());
    }


    @Test
    public void test8()
    {
        assertSame(Locale.JAPAN, CountryCode.JP.toLocale());
    }


    @Test
    public void test9()
    {
        assertSame(Locale.KOREA, CountryCode.KR.toLocale());
    }


    @Test
    public void test10()
    {
        assertSame(Locale.TAIWAN, CountryCode.TW.toLocale());
    }


    @Test
    public void test11()
    {
        assertSame(Locale.US, CountryCode.US.toLocale());
    }


    @Test
    public void test14()
    {
        assertNull(getByCode("undefined"));
    }


    @Test
    public void test17()
    {
        assertNull(getByCode(null));
    }


    @Test
    public void test18()
    {
        assertNull(getByCode(""));
    }

    @Test
    public void testLocale()
    {
        for(CountryCode code : CountryCode.values()){
            System.out.println(code.getName());
        }
        assertNull(null, null);
    }
}
