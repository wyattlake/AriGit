import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GitTester {
    @Test
    void testAddToIndex() throws IOException {
        Git.addToIndex("testCompare", "aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d");
    }

    @Test
    void testBlob() {

    }

    @Test
    void testByteArrayToHexString() {

    }

    @Test
    void testDeleteDir() {

    }

    @Test
    void testDeleteFile() {

    }

    @Test
    void testGenerateSha1() {

    }

    @Test
    void testInit() throws IOException {
        Git.init();

        assertTrue(Util.exists("objects"));
        assertTrue(Util.exists("index"));
    }

    @Test
    void testRemove() {

    }

    @Test
    void testStringToFile() {

    }
}
