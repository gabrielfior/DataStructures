
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by gabrielfior on 25.09.17.
 */
@RunWith(JUnit4.class)
public class AnalyzerTest {
    @Test
    public void readFile() throws Exception {

        Analyzer analyzer = new Analyzer();
        String filename = "test1.txt";
        List<Sentence> file1 = analyzer.readFile(filename);


    }


}
