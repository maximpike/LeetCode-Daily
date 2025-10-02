package org.cl.medium;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams_example1() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("tan", "nat"),
                List.of("eat", "ate", "tea")
        );

        GroupAnagrams ga = new GroupAnagrams();
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution1(input));
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution2(input));

//        GroupAnagramsReview gar = new GroupAnagramsReview();
//        assertAnagramGroupsEqual(expected, gar.groupAnagrams(input));
    }

    @Test
    void groupAnagrams_example2() {
        String[] input = {""};
        List<List<String>> expected = List.of(List.of("", ""));

        GroupAnagrams ga = new GroupAnagrams();
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution1(input));
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution2(input));
//
//        GroupAnagramsReview gar = new GroupAnagramsReview();
//        assertAnagramGroupsEqual(expected, gar.groupAnagrams(input));
    }

    @Test
    void groupAnagrams_example3() {
        String[] input = {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        GroupAnagrams ga = new GroupAnagrams();
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution1(input));
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution2(input));

//        GroupAnagramsReview gar = new GroupAnagramsReview();
//        assertAnagramGroupsEqual(expected, gar.groupAnagrams(input));
    }

    @Test
    void groupAnagrams_example4() {
        String[] input = {"conversation", "conservation", "anagram", "nagaram"};
        List<List<String>> expected = List.of(
                List.of("conversation", "conservation"),
                List.of("anagram", "nagaram")
        );
        GroupAnagrams ga = new GroupAnagrams();
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution1(input));
        assertAnagramGroupsEqual(expected, ga.groupAnagrams_solution2(input));

//        GroupAnagramsReview gar = new GroupAnagramsReview();
//        assertAnagramGroupsEqual(expected, gar.groupAnagrams(input));
    }

    private void assertAnagramGroupsEqual(List<List<String>> expected, List<List<String>> actual) {
        assertEquals(expected.size(), actual.size(), "Number of groups should match");

        // Convert bot lists to sets of order-independent comparison
        Set<Set<String>> expectedSets = expected.stream()
                .map(list -> Set.copyOf(list))
                .collect(Collectors.toSet());

        Set<Set<String>> actualSets = actual.stream()
                .map(list -> Set.copyOf(list))
                .collect(Collectors.toSet());

        assertEquals(expectedSets, actualSets, "Anagram groups should match (order independent)");
    }
}