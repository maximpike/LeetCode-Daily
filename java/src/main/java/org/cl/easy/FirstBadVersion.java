package org.cl.easy;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int l = 0;
        int r = n;
        int badVersion = -1;

        while (l <= r) {

            int m = l + ((l-r)/2); // protect against integer overflow

            if (isBadVersion(m)) {
                badVersion = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return badVersion;
    }
}

// Dummy Class
class VersionControl {

    public boolean isBadVersion(int version) {
        return false;
    }
}

