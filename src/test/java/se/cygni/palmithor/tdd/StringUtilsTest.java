package se.cygni.palmithor.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringUtilsTest {

    private StringUtils stringUtils = new StringUtils();

    @Test
    public void isPalindrome() {
        assertThat(stringUtils.isPalindrome(null)).isFalse();
        assertThat(stringUtils.isPalindrome("")).isTrue();
        assertThat(stringUtils.isPalindrome("aa")).isTrue();
        assertThat(stringUtils.isPalindrome("abba")).isTrue();
        assertThat(stringUtils.isPalindrome("ab1ba")).isTrue();
    }

    /**
     * For the following function, you choose if you want to use TDD or not
     */
    @Test
    public void isBlank() {
        // stringUtils.isBlank()
    }
}