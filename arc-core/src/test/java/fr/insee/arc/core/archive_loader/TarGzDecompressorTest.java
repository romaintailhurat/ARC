package fr.insee.arc.core.archive_loader;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static org.junit.Assert.*;

public class TarGzDecompressorTest {

    private Path simpleTarFileURI;

    @Rule
    public TemporaryFolder tempDir = new TemporaryFolder();

    /** Prepare test data by copying existing test archive files */
    @Before
    public void setUp() throws Exception {
        URL fileURL = TarGzDecompressorTest.class.getResource("test-archive-simple-file.tar.gz");
        Path src = Paths.get(fileURL.toURI());
        File tempArchive = File.createTempFile("archive-", ".tar.gz");

        simpleTarFileURI = tempArchive.toPath();

        Files.copy(src, tempArchive.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void extractSimpleFile() throws IOException {
        TarGzDecompressor decompressor = new TarGzDecompressor();
        System.out.println("Path to test archive is: " + simpleTarFileURI.toString());
        decompressor.extract(new File(simpleTarFileURI.toString()));
        assertTrue(false);
    }
}