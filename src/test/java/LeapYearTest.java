import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void testLeapYearTrue(){
        LeapYear ly = new LeapYear();
        assertTrue(ly.isLeapYear(2000));
        assertTrue(ly.isLeapYear(2020));
        assertTrue(ly.isLeapYear(2024));
        assertTrue(ly.isLeapYear(2196));

    }

    @Test
    public void testLeapYearFalse(){
        LeapYear ly = new LeapYear();
        assertFalse(ly.isLeapYear(1700));
        assertFalse(ly.isLeapYear(1800));
        assertFalse(ly.isLeapYear(1900));
        assertFalse(ly.isLeapYear(2100));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1896, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956,
            1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052,
            2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096, 2104, 2108, 2112, 2116, 2120, 2124, 2128, 2132, 2136, 2140, 2144, 2148,
            2152, 2156, 2160, 2164, 2168, 2172, 2176, 2180, 2184, 2188, 2192, 2196})
    public void testLeapYearAllTrue(int x){
        LeapYear ly = new LeapYear();
        assertTrue(ly.isLeapYear(x));
    }

    @ParameterizedTest
    @ValueSource(ints = {1898,1903,1906,1911,1919,1925,1933,1941,1950,1953,1958,1969,1973,1983,2005, 2009, 2013, 2017, 2021, 2025, 2029, 2033, 2037, 2041, 2045, 2049, 2053,
            2057, 2061, 2065, 2069, 2073, 2077, 2081, 2085, 2089, 2093, 2097, 2105, 2109, 2113, 2117, 2121, 2125, 2129, 2133, 2137, 2141, 2145, 2149,
            2153, 2157, 2161, 2165, 2169, 2173, 2177, 2181, 2185, 2189, 2193, 2197})
    public void testLeapYearAllFalse(int x){
        LeapYear ly = new LeapYear();
        assertFalse(ly.isLeapYear(x));
    }
}