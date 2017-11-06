
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * Created by gabrielfior on 25.09.17.
 */
@RunWith(JUnit4.class)
public class AnalyzerTest {
    @Test
    public void readFile() throws Exception {

        Analyzer analyzer = new Analyzer();
        String filename = "resources/test5.txt";
        List<Sentence> file1 = analyzer.readFile(filename);

        System.out.println("debug");

    }

    @Test
    public void testReadFileEasy() throws Exception {

        Analyzer analyzer = new Analyzer();
        String filename = "resources/test1.txt";
        List<String> file1 = analyzer.readFileIntoListStrings(filename);

        System.out.println("debug");


    }


}
