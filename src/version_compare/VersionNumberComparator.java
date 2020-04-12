package version_compare;

import java.util.Comparator;

/**
 * @author Mahedi Hassan
 * 2020-04-07
 */

public class VersionNumberComparator implements Comparator<String> {

    @Override
    public int compare(String version1, String version2) {
        String version1Array [] = version1.trim().split("\\.");
        String version2Array [] = version2.trim().split("\\.");
//        Integer version2Array [] = Arrays.stream(version2.trim().split("\\."))
//                .map(Integer::parseInt)
//                .toArray(Integer[]::new);

            for (int i = 0; version1Array.length > i || version2Array.length > i; i++){
                if (version1Array.length > i && version2Array.length > i) {
                    if (Integer.parseInt(version1Array[i]) == Integer.parseInt(version2Array[i])) {
                        continue;
                    } else if (Integer.parseInt(version1Array[i]) > Integer.parseInt(version2Array[i])) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
                else if (version1Array.length > i){
                    if (Integer.parseInt(version1Array[i]) > 0){
                        return 1;
                    }
                    else return 0;
                }
                else if (version2Array.length > i){
                    if (Integer.parseInt(version2Array[i]) > 0){
                        return -1;
                    }
                    else return 0;
                }

            }
            return 0;
    }
}
