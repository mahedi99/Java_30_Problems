package version_compare;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahedi Hassan
 * 2020-04-12
 */

class VersionNumberComparatorTest {
    Comparator<String> compareVersion = new VersionNumberComparator();

    @Test
    public void compareVersion(){
        assertTrue(compareVersion.compare("14", "14.0") == 0);
        assertTrue(compareVersion.compare("15", "14") > 0);
        assertTrue(compareVersion.compare("15.1", "14.13.10") > 0);
        assertTrue(compareVersion.compare("15.1", "15.1.0") == 0);
        assertTrue(compareVersion.compare("15.1.1", "14.13.10")  > 0);
        assertTrue(compareVersion.compare("14.13", "14.10.55") > 0);
        assertTrue(compareVersion.compare("14.13.10", "14.10.55") > 0);
        assertTrue(compareVersion.compare("14.10.55", "14.10.20") > 0);
        assertTrue(compareVersion.compare("14.10.20", "14.10.20") == 0);
    }
}